package com.luhanlin.actor_

import akka.actor.{Actor, ActorRef, ActorSystem, Props}

/**
  * 建立两个Actor 相互传递消息
  *
  * 定义消息：样本类，区分消息的不同
  *
  */
//消息的定义 样本类
case object  PingMessage
case object  PongMessage
case object  StartMessage
case object  StopMessage

class Ping(pong : ActorRef) extends Actor {

  var count = 0
  def incrementAndPing {count += 1; println(" Ping ") }

  override def receive: Receive = {
    case StartMessage =>
      incrementAndPing
      pong ! PingMessage
    case PongMessage =>
      if (count > 9){
        pong ! StopMessage
        println("ping Stop")
        context.stop(self)
      } else {
        incrementAndPing
        pong ! PingMessage

      }

  }
}

class Pong extends Actor{
  override def receive: Receive = {
    case PingMessage =>
      println(" pong")
    // 给 ping 回复消息
    sender ! PongMessage
    case StopMessage =>
      println("pong Stop")
      context.stop(self)
      //context.system.finalize()
  }
}

object Demo2 extends App{
  val system = ActorSystem("PingPongSystem")
  val pong = system.actorOf(Props[Pong],name="pong")
  val ping = system.actorOf(Props(new Ping(pong)) , name ="ping")

  ping ! StartMessage

}
