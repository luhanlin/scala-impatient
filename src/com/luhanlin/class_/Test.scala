package com.luhanlin.class_

object Test {

    def main(args: Array[String]): Unit = {
        val counter = new Counter()

        counter.increment()
        println(counter.current)

        val person = new Person()
        person.setAge(11)
        person.setAge(22)
        person.setAge(15)

        println(person.getAge)
    }
}
