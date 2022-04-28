package fundamentos

//Ele permite o uso dos metodos de um tipo de acordo com a checagem
fun teste(x: Any) {
    if (x is String) {
        println(x.toUpperCase())
    } else if (x is Int) {
        println(x.plus(3))
    }
}

fun teste2(x: Any) {
    when(x) {
        is String -> println(x.uppercase())
        is Int -> println(x.plus(3))
        else -> println("Tipo Invalido")
    }
}

fun main(args: Array<String>) {
    teste("Olá")
    teste(1)
    teste2("Olá2")
    teste2(2)
}