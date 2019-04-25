package com.luhanlin.akka

/*
* 样本类，保存所有的消息
* */

//worker  --->  master   注册节点
case class RegisterWorker(id:String, workerHost: String, memory : String, cores:String)

// worker  --->  master   发送心跳信号
case class HeartBeat(workId:String)

// master  --->  master   检查超时节点
case class CheckOfTimeOutWorker()

// master  --->  worker   注册完成通知
case class RegisteredWorker(valWorkerHost:String)

// worker  --->  worker   提醒自己发送心跳信号
case class SendHeartBeat()

