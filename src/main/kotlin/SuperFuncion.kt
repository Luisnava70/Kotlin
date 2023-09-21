fun main() {
    val largoValorIncial = superFuncion(valorInicial = "Hola") { valor ->
        valor.length
    }

    println(largoValorIncial)

    val lam = funcionInseption("Luis")
    val valor = lam()
    println(valor)
}
//Estamos recibinedo una lambda
                                //sintaxis para nombrar las lambdas
fun superFuncion(valorInicial : String, block : (String) -> Int) : Int{
    return block(valorInicial)
}

fun funcionInseption(nombre : String) : () -> String {
    return {
        "Hola desde la lambda $nombre"
    }
}