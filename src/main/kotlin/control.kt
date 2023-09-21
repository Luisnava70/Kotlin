fun main(args: Array<String>){
    val nombreColor = " "

    when(nombreColor){
        "amarillo" ->{
        println("El amarillo es un color muy bonito")
        }
        "Rojo", "carmesi" -> {
            println("El rojo es un colo muy loco")
        }
        else ->{
            println("No tengo informacion del color")
        }
    }

    val numCode = 405
    when(numCode){
        in 200..299 -> {
            println(numCode)
        }
        in 400..421 -> {
            println("Hola mundo")
        }
        else ->{
            println("Codigo erroneo")
        }
    }

    val tallaZapato = 11
    val mensaje = when(tallaZapato){
        5 -> "El zapato esta casi agotado"
        6 -> "Solo nos quedan 600"
        11 -> "Usted esta paton"
        else -> "No quiere unos tacos"
    }
    println(mensaje)
}