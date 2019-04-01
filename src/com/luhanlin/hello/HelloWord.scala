package com.luhanlin.hello

object HelloWord {

    def main(args: Array[String]): Unit = {
//        val name = StdIn.readLine("Your name: ")
//        print("Your age: ")
//        val age = StdIn.readInt()
//        println(s"com.luhanlin.hello.Hello, ${name}! Next year, you will be ${age + 1}.")

//        var sum = 0
//        for (ch <- "hello") sum += ch
//        print(sum)

//        val result = for (i <- 1 to 10) yield i % 3
//        print(result)

//        print(sum(1,2,3,4))
//        print(sum(1 to 5: _*))  // range


    }

    def sum(args: Int*) = {
        var result = 0
        for (arg <- args) result += arg
        result
    }


}
