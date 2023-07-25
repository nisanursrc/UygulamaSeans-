package com.example.uygulama1

//İki sayının asal olup olmadığını kontrol eden bir fonksiyonu nasıl yazarsınız?

fun main() {
    val number1 = 17
    val number2 = 23

    if (isPrime(number1)) {
        println("$number1  asal sayıdır.")
    } else {
        println("$number1  asal sayı değildir.")
    }

    if (isPrime(number2)) {
        println("$number2  asal sayıdır.")
    } else {
        println("$number2  asal sayı değildir.")
    }
}

fun isPrime(number: Int): Boolean {
    if (number <= 1) {
        return false
    }

    for (i in 2 until number) {
        if (number % i == 0) {
            return false
        }
    }

    return true
}
