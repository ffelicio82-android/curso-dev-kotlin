fun main() {
    // Tipagem implícita. Não é necessário indicar o tipo. O mesmo será indicado em tempo de compilação
    val somaComRetorno1 = somarComRetorno(1, 2)
    println("------------- Tipagem implícita  -------------")
    println(somaComRetorno1)
    println("------------- Tipagem implícita  -------------")
    println()

    // Tipagem explícita. Informa o tipo da variável
    val somaComRetorno2 : Int = somarComRetorno(3, 4)
    println("------------- Tipagem explícita  -------------")
    println(somaComRetorno2)
    println("------------- Tipagem explícita  -------------")
    println()

    // Parâmetros nomeados
    // Dessa forma não é necessário indicar os valores na ordem que a função pede
    // Na definição da função a mesma está seguindo a ordem alfabética dos atributos, mas como está sendo utilizado da forma abaixo, não será apresentado erro
    val somaComRetorno3 = somarComRetorno(b = 5, a = 6)
    println("------------- Parâmetros nomeados  -------------")
    println(somaComRetorno3)
    println("------------- Parâmetros nomeados  -------------")
    println()

    println("------------- Função sem retorno  -------------")
    somarSemRetorno(7, 8)
    println("------------- Função sem retorno  -------------")
}

/*
// A função também poderia ser feita da forma abaixo
// Como há somente um retorno, a função pode ser realizada em somente uma linha
```
fun somarComRetorno(a: Int, b: Int) : Int = a + b
```
*/
fun somarComRetorno(a: Int, b: Int) : Int {
    return a + b
}

/*
// Também poderia ser feito dessa forma quando não há o retorno na função
// O *Unit* indica que a função não retornará nada (corresponde ao void em Java).
// Geralmente a IDE informa para remover indicando "Redundant 'Unit' return type".
// Ao contrário de void, Unit é uma classe real (Singleton) com apenas uma instância.
// Na realidade, toda função retorna algo, sempre.
// A diferença é que quando não há a declaração de um retorno, implicitamente (por baixo dos panos) o Kotlin retorna o tipo Unit.
```
fun somarSemRetorno(a: Int, b: Int) : Unit {
    println(message = a + b)
}
```
*/
fun somarSemRetorno(a: Int, b: Int) {
    println(message = a + b)
}