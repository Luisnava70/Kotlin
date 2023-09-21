fun main() {
    val moviles = mutableListOf("Xiaomi redmi note 10","Xiaomi redmi note 11",
        "Iphone 14","Xiaomi redmi note 10",).also {
        lista -> println("El valor de la lista es $lista")
    }.asReversed()

    println(moviles)

    val set = setOf("a","b","c")
    val lista = listOf(1,2,3,4)
}