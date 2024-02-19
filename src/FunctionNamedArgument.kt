fun fullName(firstName: String, middleName: String, lastName: String, age: Int? = null) {
    if (age == null){
        println("Halo $firstName $middleName $lastName")
    } else {
        println("Halo $firstName $middleName $lastName. usianya sekarang $age.")
    }
}

fun main(){
    fullName(firstName = "Dini", lastName = "Efendi", middleName = "Tria")
    fullName(lastName = "Efendi", middleName = "Merlia", age = 20, firstName = "Dina")
}