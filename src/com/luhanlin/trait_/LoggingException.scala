package com.luhanlin.trait_

trait LoggingException extends ConsoleLogger{

    this : Exception =>
        def log(): Unit = {
            log(getMessage)
        }
}
