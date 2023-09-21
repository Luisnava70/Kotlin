fun main(args: Array<String>) {
    val edadDeSuperHeores = mapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Capitan america" to 99,
        "Joker" to 43
        )

    println(edadDeSuperHeores)

    val edadDeSuperHeoresMutables = mutableMapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Capitan america" to 99,
        "Joker" to 43
    )
    println("Mapa mutable " + edadDeSuperHeoresMutables)

    edadDeSuperHeoresMutables["Wolvering"] = 26
    println("Mapa mutable " + edadDeSuperHeoresMutables)

    val edadIronMan = edadDeSuperHeoresMutables["Ironman"]
    println(edadIronMan)

    val quitandoHeroe = edadDeSuperHeoresMutables.remove("Joker")

    println(quitandoHeroe)

    println(edadDeSuperHeoresMutables.keys)
    println(edadDeSuperHeoresMutables.size)
    println(edadDeSuperHeoresMutables.values)

}