package com.example.uygulama1

//Bir sayının faktöriyelini hesaplayan bir fonksiyonu nasıl oluşturursunuz?

fun main() {
    var a = readLine()!!.toInt()
    var i = 1;
    var d = 1;
    while (i <= a) {
        d *= i;
        i++;
    }
    println("${a}!=${d}")
}



    //2.yöntem
    /*
    fun faktoriyelHesapla(sayi: Int): Int {
        var sonuc = 1
        for (i in 1..sayi) {
            sonuc *= i
        }
        return sonuc
    }
}


     */


