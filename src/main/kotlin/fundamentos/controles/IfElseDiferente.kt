package fundamentos.controles

fun main(args: Array<String>) {
    //Maneira diferente de se usar if else no Kotlin
    val num1 = 2
    val num2 = 3

    //O ultimo valor do bloco é o que vai ser retornado na expressa (no caso, num1 e num2)
    val maiorValor = if (num1 > num2) {
        println("processando...")
        num1
    } else {
        println("processando...")
        num2
    }

    println("O maior valor é $maiorValor")

}