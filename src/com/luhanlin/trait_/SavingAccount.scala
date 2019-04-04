package com.luhanlin.trait_

class SavingAccount extends Account with ConsoleLogger with ShortLogging {
    var interest = 0.0
    def withdraw(amount: Double) {
        if (amount > balance) log("Insufficient funds")
        else info("info msg")
    }

    override val maxLength: Int = 15
}
