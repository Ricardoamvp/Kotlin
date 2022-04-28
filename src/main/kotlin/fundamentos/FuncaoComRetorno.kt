package fundamentos

//o valor padrão de mantém caso não seja inserido outro atributo
fun soma(a: Int, b: Int = 1): Int {
    return a + b
}

fun main(args: Array<String>) {
    println(soma(2))
    println(soma(10, 5))
}