//package com.luhanlin.match_
//
///**
//  * 逆变
//  *
//  * 表示在类型参数前面加上 - 。泛型变量的值，可以是本身类型或者其父类类型。
//  */
//
//class Animal
//
//class Bird extends Animal
//
//class Sparrow extends Bird
//
////定义第四个类：吃东西的类
//class EatSomething[-T](t:T)
//
//
//object Demo5 {
//  def main(args: Array[String]): Unit = {
//    //定义一个鸟吃东西的对象
//    var c1 : EatSomething[Bird] = new EatSomething[Bird](new Bird)
//
//    var c2 : EatSomething[Sparrow] = c1
//
//  }
//}
