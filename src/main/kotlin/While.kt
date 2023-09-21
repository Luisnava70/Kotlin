fun main(args: Array<String>){
    var contador = 5;

    while (contador > 0){
        println("Hola mundo $contador")
        contador--
    }

    do {
        println("Numero aleatorio")
        var numeroAleatorio = (0..100).random()
        println("Numero generado $numeroAleatorio")
    }while (numeroAleatorio <= 50)
}