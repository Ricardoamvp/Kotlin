package fundamentos

import fundamentos.pacoteA.simplesFuncao as funcaoSimples
import fundamentos.pacoteA.Coisa
import fundamentos.pacoteA.FaceMoeda.CARA
import fundamentos.pacoteB.*

/*
No momento que as funcoes sao importadas, não e necessario especificar a qual file elas pertencem
entao funcoes com o mesmo nome, mesmo que em files diferentes serao um problema
*/

fun main(args: Array<String>) {
    println(funcaoSimples("Ok"))

    val coisa = Coisa("Bola")
    println(coisa.nome)

    println(CARA)

    println("${soma(2, 3)} ${ subtracao(6, 8)}")
}