package com.luhanlin.match_

/**
  * 上界
  */
//定义父类
class Vehicle2 {
  //函数：驾驶
  def drive() = println("Driving")
}

//定义两个子类
class Car2 extends  Vehicle2 {
  override  def drive() : Unit = println("Car Driving")
}

class Bike2{
    def drive() : Unit = println("Bike Driving")
}

object ScalaUpperBound {
  //定义驾驶交通工具的函数
  def takeVehicle[T <: Vehicle2](v:T) = v.drive()

  def main(args: Array[String]): Unit = {
    //定义交通工具
    // error
//    var v :Vehicle = new Vehicle
//    takeVehicle(v)

    var c : Car2 = new Car2
    takeVehicle(c)

    // error
//    var b : Bike2 = new Bike2
//    takeVehicle(b)

  }
}
