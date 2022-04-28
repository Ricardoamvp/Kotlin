package fundamentos.controles

fun main(args: Array<String>) {
    val nota = 9

    if (nota in 9..10) {
        println("Fantástico")
    } else if (nota in 7..8) {
        println("Parabéns")
    } else if (nota in 4..6) {
        println("Dá pra recuperar")
    } else {
        println("Te vejo no próximo semestre")
    }

}