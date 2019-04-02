package com.luhanlin.class_.enumeration

import com.luhanlin.class_.enumeration.TrafficLightColor._

object EnumApp extends App {

    for (c <- TrafficLightColor.values) println(s"${c.id}: $c")

    println(doWhat(Red))

    //    TrafficLightColor(0) // Calls Enumeration.apply
    //    TrafficLightColor.withName("Red")

    def doWhat(color: TrafficLightColor) = {
        if (color == Red) "stop"
        else if (color == Yellow) "hurry up"
        else "go"
    }
}
