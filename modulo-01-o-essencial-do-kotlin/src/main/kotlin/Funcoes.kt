/*
    Funções
*/

fun main() {
    println(dobro(2))
    println(dobro2(4))

    // uso da função sem utilizar parâmetros nomeados
    println(concatenar("Fernando", "Felicio"))

    // uso da função utilizando parâmetros nomeados
    println(concatenar(a = "Jordana", b = "Souza"))

    // uso da função utilizando somente uma referência de parâmetro nomeado
    println(concatenar("Nick", b = "Fury"))

    // uso da função utilizando parâmetros nomeados, mas sem estar na ordem
    println(concatenar(b = "Felicio", a = "Duke"))

    // uso da função utilizando somente o valor do primeiro parâmetro
    println(concatenarComValorPadrao("Teste"))

    // uso da função e sobrescrevendo o valor do segundo parâmetro
    println(concatenarComValorPadrao("Francisco", "Felicio"))

    // uso da função e utilizando o função filha
    println(concatenarValorUsandoFuncaoInterna("Maria", "Josefa"))

    // uso de member functions
    println(Pessoa().mostrarNome())
}

fun dobro(x: Int) : Int {
    return x * x
}

fun dobro2(x: Int) : Int = x * x

fun concatenar(a: String, b: String) : String {
    return "$a - $b"
}

fun concatenarComValorPadrao(a: String, b: String = "Valor padrão") : String {
    return "$a - $b"
}

fun concatenarValorUsandoFuncaoInterna(a: String, b: String) : String {
    // Essa função só irá funcionar dentro do escopo da função pai
    // são chamadas de funções locais
    fun pegarPrimeiraLetra(valor: String): Char {
        return valor[0]
    }

    return pegarPrimeiraLetra(a) + " - " + pegarPrimeiraLetra(b)
}

class Pessoa {
    // A função abaixo é denominada como member function.
    // Ela é definida dessa forma devido a mesma estar vinculada em uma classe
    fun mostrarNome() : String = "Fernando Felicio"
}