fun main() {
    println("Ingeresa el dato")
    val lado1 = readln().toFloat()
    println("Ingeresa el dato")
    val lado2 = readln().toFloat()
    println("Ingeresa el dato")
    val lado3 = readln().toFloat()

    triangulo(lado1,lado2,lado3)

    idenify("hola")
}

fun triangulo(lado1: Float,lado2: Float,lado3: Float){

    if (lado1 == lado2 && lado2 == lado3){
        println("Triangulo equilatero")
    }else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
        println("triangulo isoceles")
    }else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
        println("triangulo escaleno")
    }
}

fun idenify(valor: Any){
   when(valor){
       is String -> println("String")
       is Int -> println("Int")
       is Double -> println("Double")
   }
}