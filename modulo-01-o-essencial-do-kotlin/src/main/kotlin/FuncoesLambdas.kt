/*
    Funções Lambdas
*/

fun main() {
    val scorePrimeiroJogo : Int = 10
    val scoreSegundoJogo : Int = 10

    val somaTotalDosJogos = { valorJogoA : Int, valorJogoB : Int ->
        valorJogoA + valorJogoB
    }
    println("resultado dos jogos: ${somaTotalDosJogos(scorePrimeiroJogo, scoreSegundoJogo)}")

    val somaTotalDosJogosComTipagem : (Int, Int) -> Int = { valorJogoA : Int, valorJogoB : Int ->
        println("valores\njogo a = $valorJogoA\njogo b = $valorJogoB")
        valorJogoA + valorJogoB
    }
    println("resultado dos jogos (com tipagem): ${somaTotalDosJogosComTipagem(scorePrimeiroJogo, scoreSegundoJogo)}")
}