package com.luhanlin.class_.define

/**
  * Created by root on 2019/3/23.
  *
  * 抽象类：只能用于继承的类，可以包含抽象方法。
  *
  */
//父类：交通工具类
abstract class Vehicle{
  //定义抽象方法： 没有实现的方法
  def checkType() : String
}

//子类：自行车、汽车。
class Car extends Vehicle {
  def checkType : String = "I am a car"
}

class Bike extends Vehicle{
  def checkType : String = "I am a bike"
}

object Demo2 {
  def main(args: Array[String]): Unit = {
    var v1 : Vehicle = new Car
    println(v1.checkType())

    var v2 :Vehicle = new Bike
    println(v2.checkType())

    //多态
  }
}
