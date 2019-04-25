package com.luhanlin.match_

/**
  * 协变：表示在类型参数前面加上 + 。泛型变量的值，可以是本身类型或者其子类类型。
  */
class Animal

class Bird extends Animal

class Sparrow extends Bird

//定义第四个类：吃东西的类
class EatSomething[+T](t:T)



object Demo4 {

  def main(args: Array[String]): Unit = {
    //定义一个鸟吃东西的对象
    var c1 : EatSomething[Bird] = new EatSomething[Bird](new Bird)

    //定义一个动物吃东西的对象
    var c2 : EatSomething[Animal] = c1

    /*
    * 问题：能否把 c1 赋给 c2
    *
    * class EatSomething[T](t:T)
    * var c2 : EatSomething[Animal] = c1 报错
    * 原因： EatSomething[Bird] 并没有 继承 EatSomething[Animal]
    *
    * class EatSomething[+T](t:T)
    *
    * 报错消失。
    *
    * 协变
    *
    * */

    var c3 : EatSomething[Sparrow] = new EatSomething[Sparrow](new Sparrow)
    var c4 : EatSomething[Animal] = c3

  }

}

