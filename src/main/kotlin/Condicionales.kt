fun main() {
    //verifyed()
    gradoEscolar()
}

fun verifyed(){
    println("Ingrese su edad: ")
    val age = readln()?.toInt()

    if (age != null) {
        if(age >= 18){
            println("Eres mayor de edad")
        }else if (age == 18){
            println("Tienes 18")
        } else{
            println("Eres un niño")
        }
    }

    if (age != null) {
        if (age.equals(18!!)){
            println("Mayor de edad")
        }
    }
}

fun gradoEscolar(){
    println("Ingrese tu edad")
    val edad = readln().toInt()

    when(edad){
        0 -> println("A penas eres un recien nacido")
        1-> println("Solo tienes un año de edad")
        in 2..5 -> println("Estas en preescolar")
        in 6..11 -> println("Estas en primaria")
        in 12..15 -> println("Estas en Secundaria")
        in 16..18 -> println("Estas en prepa")
        in 18..30 -> println("Estas en Universiad o ya saliste")
        in 30..80 -> println("Ya debes trabajar o muerto")
        else -> {
            println("Edad invalida")
            println("Vuelbe a corre el codigo")
        }
    }
}