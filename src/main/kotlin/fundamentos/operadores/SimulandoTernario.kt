package fundamentos.operadores

fun main(args: Array<String>) {
    val nota = 7
    val resultado = if(nota >= 7) "Aprovado" else "Reprovado"
    println(resultado)


    fun obterResultado(nota: Double): String = if(nota >= 7) "Aprovado" else "Reprovado"

    println(obterResultado(6.7))

}