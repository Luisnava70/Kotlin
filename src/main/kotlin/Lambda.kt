
fun main(args: Array<String>) {

    val myLambda : (String) -> Int ={
        valor -> valor.length
    }
    val lambdaEjecutada = myLambda("Hola soy luisito")

    println(lambdaEjecutada)

    var saludos = listOf("Adios","ciao","Good bye")
    var longitudSaludos = saludos.map(myLambda)
    println(longitudSaludos)
}