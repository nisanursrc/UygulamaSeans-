package com.example.uygulama1

//Bir "Öğrenci" adlı sınıf oluşturun ve öğrencilerin adı, soyadı ve sınıfı gibi özellikleri içeren özellikleri tanımlayın. Ardından, bu sınıftan beş öğrenci nesnesi oluşturun ve bu öğrencilerin özelliklerini ekrana yazdıran bir fonksiyon yazın

fun main() {
    val ogrenci1 = Ogrenci("Ali", "Yılmaz", "10-A")
    val ogrenci2 = Ogrenci("Ayşe", "Demir", "9-B")
    val ogrenci3 = Ogrenci("Mehmet", "Kaya", "11-C")
    val ogrenci4 = Ogrenci("Fatma", "Can", "12-D")
    val ogrenci5 = Ogrenci("Ahmet", "Çelik", "11-A")


}

fun yazdirOgrenciBilgileri(ogrenci: Ogrenci) {
    println("Öğrenci Adı: ${ogrenci.ad}")
    println("Öğrenci Soyadı: ${ogrenci.soyad}")
    println("Öğrenci Sınıfı: ${ogrenci.sinif}")
    println()
}
