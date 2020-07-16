package com.gibaram.mvcsample.model

data class Counter(var number: Int = 1) {

    fun increase() {
        this.number++
    }
}