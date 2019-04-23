package com.luhanlin.class_.define

/**
  * 实现单例模式
  */
object CreditCard {

  //定义一个变量来保存信用卡卡号
  private [this] var creditCardNumber : Long = 0

  //定义函数来产生卡号
  def generateNum() : Long = {
    creditCardNumber += 1
    creditCardNumber
  }

  def main(args: Array[String]): Unit = {
    println(CreditCard.generateNum())
    println(CreditCard.generateNum())
    println(CreditCard.generateNum())
    println(CreditCard.generateNum())

  }

}
