package com.luhanlin.match_

/**
  * 模式匹配
  */

object Demo1 {
  def main(args: Array[String]): Unit = {
    //1、相当于java switch case
    var chi = '-'
    var sign = 0

    chi match {
      case '+' => sign = 1
      case '-' => sign = -1
      case _ => sign = 0
    }
    println(sign)

    //
    /*
    2、scala中的守卫： case _ if 匹配某种类型的所有值
    * 需求：匹配所有的数字
    *
    * */

    var ch2 = '6'
    var result : Int = -1

    ch2 match {
      case '+' => println("这是一个加号")
      case '-' => println("这是一个减号")
      case _ if Character.isDigit(ch2) => result = Character.digit(ch2,10)//10 表示转换成10进制
      case _ => println("其他")
    }
    println(result)

    /*
    * 3、在模式匹配中使用变量
    *
    * */

    var mystr = "Hello World"
    //取出某个字符，赋给模式匹配的变量

    mystr(7) match {
      case '+' => println("这是一个加号")
      case '-' => println("这是一个减号")
        // case 语句中使用变量  ch 代表传递进来的字符
      case ch => println(ch)
    }

    /*
    * 上面例子 var mystr = "Hello W+rld"
    *
    * 打印：这是一个加号
    *
    * 匹配中，则 break
    *
    * */

    /*
    * 4、匹配类型 instance of
    *
    * 用法 case x : Int =>
    *
    * Any : 表示任何类型，相当于java中的Object
    * Unit ：表示没有值，void
    * Nothing : 在函数抛出异常时，返回值就是Nothing。
    *           是Scala类层级中的最低端；他是任何其他类型的子类型
    * Null ： 所有引用类型的子类。值：null
    *
    * 特殊的类型：
    *
    * Option ：表示一个值是可选的（有值或者无值）
    * Some ：如果值存在，Option[T] 就是一个 Some[T]
    * None ：如果值不存在，Option[T] 就是 None
    *
    * scala> var myMap = Map("Andy"->90)
      myMap: scala.collection.immutable.Map[String,Int] = Map(Andy -> 90)

      scala> myMap.get("Andy")
      res0: Option[Int] = Some(90)

      scala> myMap.get("Andy1231231231231")
      res1: Option[Int] = None
    *
    * Nil 空的List
    *
    *
    * 四个N总结: None Nothing Null Nil
    * None ： 如果值不存在，Option[T] 就是 None
    * Nothing ：如果方法抛出异常，则异常的返回值类型是Nothing
    * Null ： 可以赋值给所有的引用类型 但不能赋值给值类型
    *   class Student
    *   var s1 = new Student
    *   s1 = null
    *
    * Nil : 空的List
    *
    * */

    var v4 : Any = 100
    v4 match {
      case z : Int => println("这是一个整数，值是 " + z)
      case s : String => println("这是一个字符串")
      case _ => println("这是其他类型")
    }

    // 5、匹配数组和列表

    var myArray = Array(1,2,3)
    myArray match {
      case Array(0) => println("数组中只有一个0")
      case Array(x,y) => println("数组中包含两个元素")
      case Array(x,y,z) => println("数组中包含三个元素")
      case Array(x,_*)=> println("这是一个数组，包含多个元素")
    }

    var myList = List(1,2,3)
    myList match {
      case  List(0) => println("列表中只有一个0")
      case List(x,y) => println("列表中包含两个元素，和是 " + (x+y))
      case List(x,y,z) => println("列表中包含三个元素，和是 " + (x+y+z))
      case List(x,_*)=> println("这是一个列表，包含多个元素，和是 " + myList.sum)
    }

  }
}
