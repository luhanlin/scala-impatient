package com.luhanlin.class_.enumeration

object TrafficLightColor extends Enumeration {
    type TrafficLightColor = Value
    val Red = Value(0, "Red")
    val Yellow = Value(10) // Name "Yellow"
    val Green = Value("Go") // ID 11
}
