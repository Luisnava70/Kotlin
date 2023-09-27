fun main(args: Array<String>) {

    val listaComida = listOf<String>("Pozolo","Frutos rojos","Chocolates","Pan","Frutos rojos","Pozolo","gomitas","Chocolates")

    val listaNombre = listOf("pedro luis","Juan manuel", "maria ines","romeo","ernesto","juan pedro","ariadna","ana sofia","jose juan")
    println("Lista For")
    for (fruta in listaComida){
        println("Mi lista de comida: $fruta")
        if(fruta == "Chocolates"){
            println("fruta encontrada")
            break
        }
    }

    val numero = countStringRepeated(listaComida,"Frutos")
    println("numero de veces que se repite la palabra: $numero")


    println("Lista foreach")
    listaComida.forEach { fruta -> println("Lista del super: $fruta")
    }

    listaNombre.forEach { nombre -> println(nombre.length) }

    println("foreach con it")
    listaComida.forEach{ println(it) }

    println("map")
    var caracteresFruta: List<Int> = listaComida.map {
        fruta -> fruta.length
    }.also {
        println(it)
    }

    println("filter")
    val listaFiltrada = caracteresFruta.filter { largoFruta -> largoFruta > 5 }.also { println(it) }

    println("1 al 5")
    for(i in 1 .. 5){
        println(i)
    }
    println("1 antes del 5")
    for (i in 1 until 5){
        println(i)
    }
    println("cada 5")
    for(i in 0 .. 10 step 5){
        println(i)
    }

    var x = 10

    println("while")
    while(x > 0){
        println(x)
        x--
    }
}

fun countStringRepeated(lista: List<String>, stringAencontrar: String):Int{
    return lista.count{it.contains(stringAencontrar)}
}

