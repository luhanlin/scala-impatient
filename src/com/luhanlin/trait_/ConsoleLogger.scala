package com.luhanlin.trait_

trait ConsoleLogger extends Logger {
    def log(msg: String) { println(msg) }
}