fun kucing(name: String, bulu: String): String {
    return "kucing ini namanya $name, bulunya $bulu, umurnya ${umurKucing(2)} bulan"
}

fun umurKucing(age: Int): Int {
    return age
}

fun main(){
    println(kucing(name = "Sammy", bulu = "Kuning"))

    val tampung = kucing(name = "Sammy", bulu = "Hitam")
    println(tampung)

    // salah, tidak ada penampung data
    kucing(name = "Sammy", bulu = "Kuning")
}