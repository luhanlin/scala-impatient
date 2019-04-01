package com.luhanlin.collection

object Maps {

    def main(args: Array[String]): Unit = {

        val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)

        println(scores("Bob"))

        println(scores.getOrElse("bob",0))
    }
}
