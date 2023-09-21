fun main(args: Array<String>) {
    val listaComida = listOf<String>("Pozolo","Frutos rojos","Chocolates","Pan")
    for (fruta in listaComida){
        println("Mi lista de comida: $fruta")
    }
    listaComida.forEach { fruta -> println("Lista del super: $fruta")
    }

    var caracteresFruta: List<Int> = listaComida.map {
        fruta -> fruta.length
    }.also {
        println(it)
    }

    val listaFiltrada = caracteresFruta.filter { largoFruta -> largoFruta > 5 }.also { println(it) }

}