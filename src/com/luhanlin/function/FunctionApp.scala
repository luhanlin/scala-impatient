package com.luhanlin.function

import scala.math._

object FunctionApp extends App {

//    // 1. functions
//    val num = 3.14
//    val fun = ceil _
//
//    println(fun(num))
//
//    Array(3.14, 1.42, 3.44).map(fun).foreach(x => print(x + "\t"))

//    // 2. anonymous functions
//    val triple = (x: Double) => 3 * x
//
//    // or
//    def triple(x: Double) = 3 * x
//
//    Array(3.14, 1.42, 3.44).map(triple).foreach(x => print(x + "\t"))

//    // 3. function returns a function
//    def mulBy(factor : Double) = (x : Double) => factor * x
//
//    val quintuple: Double => Double = mulBy(5)
//
//    print(quintuple(20))

//    Array(3.14, 1.42, 3.44).map(x => 3 * x).foreach(x => print(x + "\t"))

//    (1 to 9).map("*" * _).foreach(println _)

//    // 4. higher-order function
//    val a = Array("Hello", "World")
//    val b = Array("hello", "warld")
//    print(a.corresponds(b)(_.equalsIgnoreCase(_)))

//    // 5. mapping function
//    (1 to 10).flatMap(i => (1 to i).map(j => i * j))

    // 6. parallel
    for (i <- (0 until 100).par) println(s" $i")
}
