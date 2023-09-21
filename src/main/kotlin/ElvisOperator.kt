
fun main(args:Array<String>) {
    var nombre: String? = null
    //hace un nulable en un no nulable
    //en caso que la variable nombre tenga valores regresara un valor..
    //en caso contrario regresara un 0
    val caracterNombre : Int = nombre?.length ?: 0
    println(caracterNombre)
}