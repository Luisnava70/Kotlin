fun main() {
    val moviles = mutableListOf("Xiaomi redmi note 10","Xiaomi redmi note 11",
        "Iphone 14","Xiaomi redmi note 10",).apply {
        removeIf { moviles -> moviles.contains("Xiaomi") }
    }
    println(moviles)

    val colores : MutableList<String> ?= mutableListOf("azul","rojo","amarillo")

    colores?.apply {
        println("Nuestros colores son $this")
        println("Mi caja contiene $size colores")
    }

}