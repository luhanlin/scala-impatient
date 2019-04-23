package com.luhanlin.class_.define

/**
  * Created by root on 2019/3/23.
  *
  * extends 继承
  *
  * 父类 ： Person 人
  * 子类 ： Employee 员工
  */

//定义父类
class Person (val name : String,val age:Int){

  //定义函数
  def sayHello() : String = "Hello " + name +" and the age is " + age
}

//定义子类
class Employee(override val name : String,override val age:Int, val slalry:Int) extends Person(name,age) {

  //重写父类中的函数

  override def sayHello(): String = "子类中的sayHello"
}

object Demo1 extends  App{

  //创建Person
  var p1 = new Person("Tom",20)
  println(p1.name+"\t"+p1.age)
  println(p1.sayHello())

  //创建一个子类对象
  var p2 : Person = new Employee("Mike",25,1000)
  println(p2.sayHello())

  //匿名子类
  var p3 :Person = new Person("Mary",25){
    //在匿名子类中重写sayHello方法
    override def sayHello(): String = "匿名子类中的sayHello"

  }
  println(p3 .sayHello())

}
