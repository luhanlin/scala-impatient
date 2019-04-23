package com.luhanlin.class_.define

/**
  * Created by root on 2019/3/23.
  *
  * 抽象字段  抽象属性
  *
  * 定义： 没有初始值的字段
  */

abstract class  Person1{
  //定义抽象字段
  val id :Int
  val name : String
}

abstract class Employee1 extends Person1{

}

class Employee2(val id:Int,val name:String) extends Person1{

}

object Demo3 {

}
