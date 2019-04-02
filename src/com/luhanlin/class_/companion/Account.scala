package com.luhanlin.class_.companion

class Account private (val id: Int, initialBalance: Double) {
    private var balance = initialBalance
    def deposit(amount: Double) { balance += amount }
}

object Account {
    def apply(initialBalance: Double) =
        new Account(newUniqueNumber(), initialBalance)
    private var lastNumber = 0
    private def newUniqueNumber() = { lastNumber += 1; lastNumber }

    def main(args: Array[String]): Unit = {
        val account = Account(100.00)
    }
}


