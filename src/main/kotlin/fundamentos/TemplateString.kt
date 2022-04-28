package fundamentos

fun main(args: Array<String>) {

    val aprovados = listOf("Ricardo", "Starck", "Marco")
    println("O primeiro colocador foi ${aprovados[0]}")

    val bomHumor = true
    print("Hoje estou ${if(bomHumor) "feliz" else "chateado"}")

}