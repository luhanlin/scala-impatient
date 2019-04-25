package com.luhanlin.actor_

import akka.actor.{Actor, ActorSystem, Props}

/**
  * Actor 示例1
  *
  */
class HelloActor extends Actor{

  override def receive: Receive = {
    case "Hello" => println("Hello Receive")
    case _ => println("other msg")
  }
}

object Demo1 extends  App{
  // 新建一个ActorSystem
  val system = ActorSystem("HelloSystem")

  //构造函数
  val helloActor = system.actorOf(Props[HelloActor],name="HelloActor")

  //发消息

  helloActor ! "Hello"
  helloActor ! "Hello1231231"

}
