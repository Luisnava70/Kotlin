import kotlin.math.pow

const val PHI = 1.618f

fun main(args: Array<String>) {

    val radius = 4f
    val area  = circeleArea(radius)
    println("el area del circulo es: $area")
    val fraseAleatoria = " caso cero".randomCase()
    imprimirFrase(fraseAleatoria)

    println(getPi())
    printhi()
}

fun imprimirFrase(frase : String){
    println("Tu frase es: $frase")
}

fun circeleArea(radius: Float): Float {
    return (PI*radius.pow(2)).toFloat()
}


fun String.randomCase() : String{
    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()
    return if (resultadoAleatorio.rem(2) == 0){
        this.uppercase()
    }else{
        this.lowercase()
    }
}

fun getPi():Float {
    return PI.toFloat()
}

fun printhi(){
    print("El numero aureo vale $PHI")
}