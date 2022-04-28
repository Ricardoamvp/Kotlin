package fundamentos

fun main(args: Array<String>) {
    val valor: Any = 1

    if(valor is String)
        println("È String")
    else
        println("Não é uma String")
}