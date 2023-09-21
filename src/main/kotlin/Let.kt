fun main() {
    var nombre : String? = null
    nombre?.let {
        valor -> println("El nombre no es nulo, es $valor")
    }

    nombre = "Luis"
    nombre?.let {
        valor->
        println("El nombre no es nulo, es $valor gg")
    }
}