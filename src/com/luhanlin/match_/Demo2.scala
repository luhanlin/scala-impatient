package com.luhanlin.match_



/**
  * 使用case class 来实现模式匹配
  */

class Vehicle

// 定义样本类
case class Car(name:String) extends  Vehicle

case class Bike(name:String) extends  Vehicle

object Demo2 {

  def main(args: Array[String]): Unit = {
    var aCar : Vehicle = new Car("Car")

    aCar match {
      case Car(name) => println("汽车 " + name)
      case Bike(name) => println("自行车 " + name)
      case _ => println("其他")
    }
  }
}
