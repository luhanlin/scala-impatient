package com.luhanlin.trait_

import java.io.PrintStream

trait FileLogger extends Logger {
    val filename: String
    lazy val out = new PrintStream(filename)
    def log(msg: String) { out.println(msg); out.flush() }
}