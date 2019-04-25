package com.luhanlin.akka

import java.util.UUID

import akka.actor._
import com.typesafe.config.ConfigFactory
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

class  Worker extends Actor{
  //Worker端持有Master端的引用（代理对象）
  //因为worker会给Master发送信息，所以才要这个对象
  var master: ActorSelection = null

  //生成一个UUID，作为Worker的标识  alt+enter
  val id = UUID.randomUUID().toString

  //构造方法执行完执行一次
  override def preStart(): Unit = {

    //Worker向MasterActorSystem发送建立连接请求
    master = context.system.actorSelection("akka.tcp://MasterActorSystem@localhost:8888/user/Master")

    //Worker向Master发送注册消息
    master ! RegisterWorker(id, "localhost", "10240", "8")

  }
  //该方法会被反复执行，用于接收消息，通过case class模式匹配接收消息
  override def receive: Receive = {

    //Master向Worker的反馈信息
    case RegisteredWorker(masterUrl) => {

      //启动定时任务，向Master发送心跳
      context.system.scheduler.schedule(0 millis, 5000 millis, self, SendHeartBeat)

    }

    case SendHeartBeat => {

      println("worker send heartbeat")
      master ! HeartBeat(id)

    }
  }
}
object Worker extends  App{
  val clientPort = 8891

  //创建WorkerActorSystem的必要参数
  val configStr =
    s"""
       |akka.actor.provider = "akka.remote.RemoteActorRefProvider"
       |akka.remote.netty.tcp.port = $clientPort
       """.stripMargin

  val config = ConfigFactory.parseString(configStr)

  val actorSystem = ActorSystem("WorkerActorSystem", config)

  //启动Actor，Master会被实例化，生命周期方法会被调用
  actorSystem.actorOf(Props[Worker], "Worker")
}
