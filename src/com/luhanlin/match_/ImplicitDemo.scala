package com.luhanlin.match_

/**
  * 隐式转换
  *
  * 定义一个隐式转换函数
  *
  * 隐式转换函数，不需要我们调用，scala会自动调用
  */
class Fruit(name:String){

  def getFruitName() : String = name
}

class Monkey(f:Fruit){
  def say() = println("Monkey like " + f.getFruitName())
}

object ImplicitDemo {
  def main(args: Array[String]): Unit = {
    //定义一个水果对象
    var f : Fruit = new Fruit("Banana")

    f.say()
  }

  implicit def fruit2Monkey(f:Fruit):Monkey = {
    new Monkey(f)
  }
}
