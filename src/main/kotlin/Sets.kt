
fun main() {
    val vocalesRepetidas = setOf("a", "e", "i", "o", "u","a", "e", "i", "o", "u")
    println(vocalesRepetidas)

    val numeroFavoritos = mutableSetOf(1,2,3,4)
    numeroFavoritos.add(5)

    println(numeroFavoritos)

    numeroFavoritos.remove(5)
    println(numeroFavoritos)

    val numeroFav = numeroFavoritos.first { numero -> numero > 3 }
    println(numeroFav)

}