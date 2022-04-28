package fundamentos

fun imprmirConceito(nota: Any) {
    when(nota as Int) {
        10, 9, 8 -> println("A")
        7, 6, 5 -> println("B")
        else -> println("Nota invalida")
    }
}

fun main(args: Array<String>) {
    val notas = arrayOf(9.4, 6.3, 7.3, 0)
    for(nota in notas) {
        imprmirConceito(nota.toInt())
    }
}