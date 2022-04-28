package fundamentos.controles

fun main(args: Array<String>) {

    for(i in 1..10) {
        println(i)
    }

    for(i in 10 downTo 1) {
        println(i)
    }

    for(i in 0..100 step 5) {
        println(i)
    }

    for(i in 100 downTo 0 step 5) {
        println(i)
    }

    val alunos = arrayListOf("Ricardo", "Ricardo1", "Ricardo2")
    for((indice, aluno) in alunos.withIndex()) {
        println("$indice - $aluno")
    }


}