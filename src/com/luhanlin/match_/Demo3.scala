package com.luhanlin.match_

/**
  * 泛型类
  */

//需求：操作一个整数
class GenericClassInt{
  //定义一个整数的变量
  private  var content :Int = 10

  //定义set get
  def set(value :Int) = content = value
  def get() : Int = content
}

//操作一个字符串
class GenericClassString{
  //定义一个整数的变量
  private  var content :String = ""

  //定义set get
  def set(value :String) = content = value
  def get() = content
}
//定义一个类，可以操作任何东西

class GenericClass[T] {
  //定义变量
  private var content : T = _ //注意：初始值用 _ 来表示

  //定义set get
  def set(value :T) = content = value
  def get() : T = content
}

object Demo3 {

  def main(args: Array[String]): Unit = {
    // 定义一个Int类型
    var v1 = new GenericClass[Int]
    v1.set(1000)
    println(v1.get())

    // 定义一个String类型
    var v2 = new GenericClass[String]
    v2.set("Hello")
    println(v2.get())
  }
}
