fun main(args: Array<String> ) {
    val numeroDeLoteria = listOf(18,5,8,12,35)
    val numeroSort = numeroDeLoteria.sorted()

    println(numeroSort)

    val loteriaDesenciente = numeroDeLoteria.sortedDescending()
    println(loteriaDesenciente)

    val ordenarPorMultiplos = numeroDeLoteria.sortedBy { numero -> numero % 2 == 0 }
    println(ordenarPorMultiplos)

    val ordenAleatorio = numeroDeLoteria.shuffled()
    println(ordenAleatorio)

    val numerosReversa = numeroDeLoteria.reversed()
    println(numerosReversa)

    val mensajesNumeros = numeroDeLoteria.map { numero -> "Numero de loteria $numero" }.also {
        println(it)
    }

    val numerosFiltrados = numeroDeLoteria.filter { numero -> numero > 20}
    println(numerosFiltrados)
}