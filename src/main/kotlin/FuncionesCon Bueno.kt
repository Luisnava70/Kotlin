import kotlin.math.pow
const val PI2:Float = 3.1416F
fun main() {
    var result = cicleArc(25F)
    println(result)
}

fun cicleArc(radius:Float): Float {
    return PI2*radius.pow(2)
}