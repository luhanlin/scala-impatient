package com.luhanlin.collection

import scala.collection.mutable.ArrayBuffer
import scala.util.Sorting

object Arrays {

    def main(args: Array[String]): Unit = {
//        JavaConversions

        val ints = new ArrayBuffer[Int]()
        ints += 1
        ints += (2,1,3,4,5)
        // You can append any collection with the ++= operator
        ints ++= Array(22,1,4,3,66)
        // removes the last two elements
        ints.trimEnd(2)

//        for (i <- ints.indices by 2) {
//            println(s"$i : ${ints(i)}")
//        }

//        val newInts = for (i <- ints if i < 0) yield i
        val newArray = ints.toArray
        Sorting.quickSort(newArray)

        for (int <- newArray) println(int)

        print(ints.sum)

        // The implicit conversion of  java and scala
//        val command = ArrayBuffer("ls", "cmd", "ln")
//        val builder = new ProcessBuilder(command)
//
//        val cmd = builder.command()

    }
}
