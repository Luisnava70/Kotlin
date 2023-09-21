    const val RESPUESTA_AFIRMATIVA = "✅"
    const val RESPUESTA_NEGATIVA = "X"
    const val RESPUESTA_DUDOSA = "?"

    val answers = mapOf(
        "Yes" to RESPUESTA_AFIRMATIVA,
        "It's true" to RESPUESTA_AFIRMATIVA,
        "Totally" to RESPUESTA_AFIRMATIVA,
        "Undoubtedly" to RESPUESTA_AFIRMATIVA,
        "Ask in an other moment" to RESPUESTA_DUDOSA,
        "I can't say you in this moment" to RESPUESTA_DUDOSA,
        "Maybe yes, or maybe not" to RESPUESTA_DUDOSA,
        "It's not going to happen" to RESPUESTA_NEGATIVA,
        "Do not count on it" to RESPUESTA_NEGATIVA,
        "Definitely not" to RESPUESTA_NEGATIVA,
        "I don't believe it" to RESPUESTA_NEGATIVA
    )

fun main() {
    println("Hola, soy bola 8, creada en kotlin \nEscoge una pregunta")
    println("1.- Quiero realizar una pregunta")
    println("2.- Revisar todas las respuestas")
    println("3.- Salir")

    val valorIngresado = readLine()
    do {
        when(valorIngresado){
            "1" -> realizarPregunta()
            "2" -> mostrarRespuestas()
            "3" -> salir()
            else -> mostrarError()
        }
    }while (valorIngresado != "3")

}

    fun mostrarRespuestas(){
        println("Selecciona una opcion")
        println("1.- revisar todas las respuestas")
        println("2.- revisar respuestas afirmativas")
        println("3.- revisar respuestas dudosas")
        println("4.- revisar solo respuestas negativas")

        val opc = readLine()
        when(opc){
            "1" -> mostrarRespuestasPorTipo("TODOS")
            "2" -> mostrarRespuestasPorTipo(tipoDeResouesta = RESPUESTA_AFIRMATIVA)
            "3" -> mostrarRespuestasPorTipo(tipoDeResouesta = RESPUESTA_DUDOSA)
            "4" -> mostrarRespuestasPorTipo(tipoDeResouesta = RESPUESTA_NEGATIVA)
            else -> println("Opcion erronea")
        }
    }

    fun mostrarRespuestasPorTipo(tipoDeResouesta : String = "TODOS"){
        when(tipoDeResouesta){
            "TODOS" -> answers.keys.forEach { respuestas -> println(respuestas) }
            RESPUESTA_AFIRMATIVA -> answers.filterValues {
                valores -> valores == RESPUESTA_AFIRMATIVA
            }.also { respuestasPositivas -> println(respuestasPositivas.keys) }
            RESPUESTA_NEGATIVA -> answers.filterValues {
                    valores -> valores == RESPUESTA_NEGATIVA
            }.also { respuestasNegativa -> println(respuestasNegativa.keys) }
            RESPUESTA_DUDOSA -> answers.filterValues {
                    valores -> valores == RESPUESTA_DUDOSA
            }.also { respuestasDudosa -> println(respuestasDudosa.keys) }

        }
    }

    fun realizarPregunta(){
        println("¿Que pregunta deseas realizar?")
        readLine()
        val respuestaGenerada = answers.keys.random()
        println(respuestaGenerada)
    }

    fun salir(){
        println("Adios")
    }

    fun mostrarError(){
        println("Opcion no valida")
    }