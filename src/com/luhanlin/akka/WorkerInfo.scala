package com.luhanlin.akka

/*
* 保存worker的基本信息
* */
class WorkerInfo(val id : String , val workerHost:String, val memory:String, val cores:String) {

  //保存心跳信息
  var lastHeartBeat : Long = System.currentTimeMillis()

  override def toString = s"WorkerInfo($id , $workerHost, $memory, $cores)"

}