package com.luhanlin.trait_

trait ShortLogging extends Logger{
//    val maxLength = 15 // A concrete field
    val maxLength :Int
    abstract override def log(msg: String) {
        super.log(
            if (msg.length <= maxLength) msg
            else s"${msg.substring(0, maxLength - 3)}...")
    }
}
