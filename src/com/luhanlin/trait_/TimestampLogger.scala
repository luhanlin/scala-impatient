package com.luhanlin.trait_

trait TimestampLogger extends Logger {
    override def log(msg: String) { // Overrides an abstract method
//        super.log(s"${java.time.Instant.now()} $msg") // Is super.log defined?
    }
}
