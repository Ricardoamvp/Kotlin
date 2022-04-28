package fundamentos.operadores

data class Carro (val marca: String, val modelo: String)

fun main(args: Array<String>) {
    val (mar, mod) = Carro("Marca","Modelo")
    println("$mar $mod")

    val (marido, mulher) = listOf("João", "Maria")
    println("$marido $mulher")

    val (_, _, terceiro) = listOf("Kimi", "Hamilton", "Alonso")
    println("$terceiro terminou em 3º lugar")
}