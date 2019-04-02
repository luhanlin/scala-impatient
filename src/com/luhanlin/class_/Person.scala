package com.luhanlin.class_

class Person {
    private var age = 0

    def getAge = age

    def setAge(newAge : Int): Unit = {
        if (newAge > age) {
            age = newAge
        }
    }
}
