package com.luhanlin.inheritance

object PersonApp extends App {
    new Person {
        override val id: Int = 1
        override var name: String = "fred"
    }
}
