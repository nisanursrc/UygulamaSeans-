package com.example.uygulama1

// Meyve" adlı bir üst sınıf oluşturun ve bu sınıfta meyvelerin adı ve tatlılık derecesi gibi özellikleri tanımlayın. Ardından "Elma" adlı bir alt sınıf oluşturun ve bu sınıfta elmalara özgü özellikleri ekleyin. "Elma" sınıfı "Meyve" sınıfından kalıtım almalıdır. Elma sınıfında "vitaminDegeri" adlı bir özelliği ve "yiyebilir" adlı bir metodu ekleyin.


fun main() {
    val elma1 = Elma("Kırmızı Elma", 8, "C vitamini")
    val elma2 = Elma("Yeşil Elma", 7, "A vitamini")

    println("Elma 1")
    println("Adı: ${elma1.ad}")
    println("Tatlık Derecesi: ${elma1.tatlikDerecesi}")
    println("Vitamin Değeri: ${elma1.vitaminDegeri}")
    elma1.yiyebilir()

    println("\nElma 2")
    println("Adı: ${elma2.ad}")
    println("Tatlık Derecesi: ${elma2.tatlikDerecesi}")
    println("Vitamin Değeri: ${elma2.vitaminDegeri}")
    elma2.yiyebilir()
}