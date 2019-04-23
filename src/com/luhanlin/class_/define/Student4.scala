package com.luhanlin.class_.define

/**
  * Created by root on 2019/3/23.
  */
class Student4(var stuName : String)

/*
*
* 定义Student4的apply方法
*
* */
object Student4 {
  // apply function 必须定义在伴生对象当中
  def apply(name:String) = {
    println("调用apply方法")
    new Student4(name)
  }

  def main(args: Array[String]): Unit = {
    // 通过主构造器来创建学生对象
    var s1 = new Student4("Tome")
    println(s1.stuName)

    //通过apply方法来创建学生对象，省略new关键字
    var s2 = Student4("Andy")
    println(s2.stuName)
  }
}
