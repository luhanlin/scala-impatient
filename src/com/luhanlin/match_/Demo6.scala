package com.luhanlin.match_

/**
  * 隐式类
  */
object Demo6 {

  def main(args: Array[String]): Unit = {
    //执行两个数字的求和

    println("两个数字的和是： " + 1.add(2))

    /*
    * 定义一个隐式类，来增强1的功能
    * Calc(x:Int)
    * 1是Int类型，所以就会传递进来
    *
    * 执行过程：
    * 1 --> Calc 类
    *
    * var a = new Calc(1)
    *
    * 在调用Calc add方法
    * a.add(2)
    *
    * */

    implicit class Calc(x:Int){
      def add(y:Int) : Int = x+y
    }
  }

}
