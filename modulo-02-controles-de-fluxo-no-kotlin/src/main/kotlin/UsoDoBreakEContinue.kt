/*
 * Break/Continue
 */

fun main() {
    val nomes = listOf<String>("Nick", "Duke", "Jordana", "Fernando")

    for(nome in nomes) {
        /*
         * Caso o nome seja igual a comparação realizada, o laço será parado
         */
        if(nome === "Fernando") {
            break;
        }

        // Printa o nome caso a condição acima não seja verdadeira
        println(nome)
    }

    println()
    println()

    val numeros = listOf<Int>(1,2,3,4,5,6)
    for(numero in numeros) {
        /*
         * Caso o número seja igual à comparação realizada, o laço ainda será percorrido, mas a diferença é que
         * haverá o pulo para o próximo item da lista, ou seja, o número "3" não será mostrado pela instrução println
         */
        if(numero == 3) {
            continue;
        }

        // Printa somente os números que não estão na verificação acima
        println(numero)
    }
}