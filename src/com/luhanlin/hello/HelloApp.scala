package com.luhanlin.hello

import util.control.Breaks._
import scala.math._
/**
  *
  * <类详细描述> 
  *
  * @author luhanlin 
  * @version [V_1.0.0, 2019/4/22 23:54] 
  * @see [相关类/方法] 
  * @since [产品/模块版本] 
  */
object HelloApp extends App {

//    println("素数打印...")
//
//    var inner_index = 0
//    var outer_index = 0
//
//    for (outer_index  <- 100 until 200) {
//        inner_index = 2
//        var flag = true
//        breakable(
//            while (inner_index < outer_index) {
//                if (outer_index % 2 == 0) {
//                    flag = false
//                    break
//                }
//                inner_index += 1
//            })
//
//        if(flag) println( outer_index )
//    }

    println("-------------冒泡排序--------------")

    val array = Array(2,1,33,44,32,1,2,3,4,5,6)

    for (i <- 0 until array.length - 1) {
        for (j <- 0 until array.length - i -1) {
            if (array(j) > array(j+1) ) {
                val temp = array(j)
                array(j) = array(j+1)
                array(j+1) = temp
            }
        }
    }

    array.foreach(println)



}
