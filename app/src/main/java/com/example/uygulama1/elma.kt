package com.example.uygulama1

class Elma(ad: String, tatlikDerecesi: Int, val vitaminDegeri: String) : Meyve(ad, tatlikDerecesi) {
    fun yiyebilir() {
        println("$ad yenebilir.")
    }
}