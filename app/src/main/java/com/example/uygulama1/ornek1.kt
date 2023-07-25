package com.example.uygulama1

//Kullanıcıdan isim ve yaş bilgisini girmesini isteyen bir programı nasıl yazarsınız?
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println(" Lütfen isminizi girin:")
    val isim = scanner.nextLine()

    println(" $isim! Lütfen yaşınızı girin:")
    val yas = scanner.nextInt()

    println("İsim: $isim")
    println("Yaş: $yas")

    scanner.close()
}