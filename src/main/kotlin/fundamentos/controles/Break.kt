package fundamentos.controles

fun main(args: Array<String>) {

    for(i in 1..10) {
        if(i == 5){
            break
        }
        println("Número $i")
    }
    println("Final")

    //Break rotulado
    loopE@for (i in 1..15) {
        for (x in 1..15) {
            if(i == 2 && x == 2) break@loopE
            println("$i $x")
        }
    }
    println("Final")

}