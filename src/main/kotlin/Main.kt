const val PI = 3.1416
const val numero2 = 21
fun main(args: Array<String>) {
    val nombre ="Jackye"
    if (nombre.isNotEmpty()) {
        println("El largo de la variable nombre es ${nombre.length} caracteres")
    } else{
        println("Error")
    }

    var mensaje = if (nombre.length >= 7){
        "Tu nombre es largo"
    }else if(nombre.isEmpty()){
        "Espacio vacio"
    } else{
        "Tu nombre es muy corto"
    }
    println(mensaje.substring(3,mensaje.length))

    var numero1 = 21
    numero1 = 3
    println(numero1)

    val explicitValue : Int = 25
    println(explicitValue.javaClass.kotlin)

    val hexadecimal = 0x0F
    println(hexadecimal)

    val million = 1_000_000
    println(million)

    val dialog : String = "Hola soy luis"
    println(dialog)

    val zelda = """
        -----------|
        |☺        ||
        |__________|
        """

    println(zelda)

    val edad: Int = 28
    println("Mi edad en dos años ${edad+2}")
    val decimal:Float = 25.4F
    println(decimal.javaClass.kotlin)

    val c = 2*(PI*decimal)
    println(c)
}