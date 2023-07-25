package com.example.uygulama1

//Kullanıcının girdiği iki sayının toplamını, farkını, çarpımını ve bölümünü hesaplayan bir fonksiyonu nasıl yazarsınız?

fun main() {
    val firstNumber = getUserInput("Birinci sayıyı giriniz: ")
    val secondNumber = getUserInput("İkinci sayıyı giriniz: ")

    val sum = addNumbers(firstNumber, secondNumber)
    val difference = subtractNumbers(firstNumber, secondNumber)
    val multiplication = multiplyNumbers(firstNumber, secondNumber)
    val division = divideNumbers(firstNumber, secondNumber)

    println("Toplam: $sum")
    println("Fark: $difference")
    println("Çarpım: $multiplication")
    println("Bölüm: $division")
}

fun getUserInput(prompt: String): Double {
    print(prompt)
    return readLine()?.toDoubleOrNull() ?: run {
        println("Geçersiz giriş! Sayı giriniz.")
        getUserInput(prompt)
    }
}

fun addNumbers(a: Double, b: Double): Double {
    return a + b
}

fun subtractNumbers(a: Double, b: Double): Double {
    return a - b
}

fun multiplyNumbers(a: Double, b: Double): Double {
    return a * b
}

fun divideNumbers(a: Double, b: Double): Double {
    if (b == 0.0) {
        throw IllegalArgumentException("Bir sayı sıfıra bölünemez!")
    }
    return a / b
}
