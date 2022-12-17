/*
    Controle de fluxo - When
 */

fun main() {
    var x : Int = 1
    when(x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> println("o valor de x não é 1 e nem 2")
    }

    // Uso do when parecido com o uso de lambda function
    when(x) {
        1 -> {
            // Outras execuções
            // ...
            // ...
            println("x == 1")
        }
        2 -> {
            // Outras execuções
            // ...
            // ...
            println("x == 2")
        }
        else -> {
            // Outras execuções
            // ...
            // ...
            println("o valor de x não é 1 e nem 2")
        }
    }

    // Uso do when parecido com o uso de lambda function
    // e tendo guardando a resposta da execeução do when em uma variável
    val mensagem : String = when(x) {
        1 -> {
            // Outras execuções
            // ...
            // ...
            "x == 1"
        }
        2 -> {
            // Outras execuções
            // ...
            // ...
            "x == 2"
        }
        else -> {
            // Outras execuções
            // ...
            // ...
            "o valor de x não é 1 e nem 2"
        }
    }
    println(mensagem)

    // Uso de múltiplos casos
    when(x) {
        1, 2 -> println("x == 1 ou x == 2")
        else -> println("o valor de x não é 1 e nem 2")
    }

    // Uso do range verificando com o operador in
    when(x) {
        in 1..10 -> println("x está entre 1 e 10")
        else -> {
            println("o valor de x não está entre 1 e 10")
        }
    }

    x = 20
    when(x) {
        !in 1..10 -> println("x não está entre 1 e 10")
        else -> println("x está entre 1 e 10")
    }
}