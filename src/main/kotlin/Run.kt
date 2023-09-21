fun main() {
    val moviles = mutableListOf("Xiaomi redmi note 10","Xiaomi redmi note 11","Iphone 14","Xiaomi redmi note 10",)

        .run {
       removeIf { moviles -> moviles.contains("Xiaomi") }
            this
    }

    println(moviles)
}