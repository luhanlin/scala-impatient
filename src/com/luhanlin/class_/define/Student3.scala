package com.luhanlin.class_.define

/**
  * 构造器
  *
  * 1、主构造器 ： 和类的声明在一起，并且一个类只能有一个主构造器
  *
  *   class Course(var courseName:String,var grade : Int)
  *
  * 2、辅助构造器 ： 一个类可以有多个辅助构造器，通过this来实现
  *
  */
class Student3(var stuName :String, var age:Int) {

  //定义一个辅助构造器，可以有多个辅助构造器
  //辅助构造器，就是一个函数，只不过这个函数的名字的叫 this

  def this (age:Int){
    this("no name",age)
    println("这是辅助构造器")
  }
}

object Student3 {
  def main(args: Array[String]): Unit = {
    //使用主构造器创建一个对象

    val s1 = new Student3("Tom", 20)
    println(s1.stuName+"\t"+s1.age)

    //使用辅助构造器
    val s2 = new Student3(25)
    println(s2.stuName+"\t"+s2.age)
  }
}
