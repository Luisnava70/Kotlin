fun main(args:Array<String>) {
    val listasNombres = listOf("Luis", "Pepe", "Toño")
    println(listasNombres)

    val listasMuatbles = mutableListOf<String>("Luis", "Pepe","Toño")
    println(listasMuatbles)
    listasMuatbles.add("Pancho")
    println(listasMuatbles)

    val usandoGet = listasMuatbles.get(0)
    println(usandoGet)

    val usandoOperador = listasMuatbles[2]
    println(usandoOperador)

    val primerValor: String? = listasNombres.firstOrNull()
    println(primerValor)

    listasMuatbles.removeAt(2)
    println(listasMuatbles)

    listasMuatbles.removeIf { caracteres -> caracteres.length > 3 }
    println(listasMuatbles)

    val myArray = arrayOf(1,2,3,4,5)
    println("Array como listas ${myArray.toList()}")
    val newArrList = myArray.reverse()
    println("Arrary como listas ${newArrList}")

}