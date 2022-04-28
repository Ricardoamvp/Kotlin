package fundamentos.operadores

import java.util.*

fun main(args: Array<String>) {

    println("Teste" === "Teste")

    val d1 = Date(0)
    val d2 = Date(0)

    //Igualdade estrutural (conteudo)
    println(d1 == d2)

    //Igualdade Referencial (endereço de memoria)
    println(d1 === d2)


}