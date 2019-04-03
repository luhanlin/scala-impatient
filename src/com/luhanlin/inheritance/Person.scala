package com.luhanlin.inheritance

abstract class Person {

    val id: Int

    var name: String
}

class Employee(val id: Int) extends Person {
    var name = ""
}

