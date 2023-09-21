fun main() {
    val colores = listOf("Azul","Verde","Morado")

    with(colores){
        println("Nuestros colores son $this")
        println("Esta lista tiene un largo de $size argumentos")
    }
}