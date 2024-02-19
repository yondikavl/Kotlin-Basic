fun tambah(angka: Int): Int = angka + angka

fun halo(name: String): Unit = println("Selamat pagi $name")

fun main(){
    println(tambah(5))
    halo(name = "Dika")
}