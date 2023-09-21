fun main(args: Array<String>) {
    //stringNulable
    val nombre : String? = null
    //println(nombre?.length)
    try {
        throw NullPointerException("Ha ocurrido un error, referencia nula")
    }catch (excepcion : NullPointerException){
        println("Erro error")
    }finally {
        println("Cerrando la aplicacion")
    }

    var primerValor = 10
    var segundoValor = 0

    var resultado = try {
        primerValor/segundoValor
    }catch (exception : Exception){
        println("no se puede dividir")
    }

    println(resultado)
}