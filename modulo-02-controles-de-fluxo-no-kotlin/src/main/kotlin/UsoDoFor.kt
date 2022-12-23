/*
*   For
*   Serve para iterar uma lista de itens
*/
fun main() {
    // Forçando a declaração do tipo, assim evita a inclusão de um valor com tipo diferente.
    // A IDE informa para remover, já que os valores contidos são todos do mesmo tipo.
    val nomes = listOf<String>("Nick", "Duke", "Jordana", "Fernando")

    for(nome in nomes) {
        println(nome)
    }

    /* Usando com uma linha */
    println()
    for(nome in nomes) println(nome)

    println()
    println()

    /*
     * Como a referência de tipo não é passado no listOf (assim como passado na criação da lista de nomes)
     * Pode ser incluído qualquer tipo de valor na função
     * */
    val valores = listOf("Nick", "Duke", "Jordana", "Fernando", 1, 2, 3, 'a', true, 1.0, 2F)
    for(valor in valores) {
        println("O valor '" + valor + "' é do tipo " + valor.javaClass.typeName)
    }

    println()
    println()

    for(i in 1..3) {
        println(i)
    }

    println()
    println()

    /* Fazendo o for de trás para frente pulando de 2 em 2 até o valor 0 */
    for(i in 6 downTo 0 step 2) {
        println(i)
    }

    println()
    println()

    val numeros = arrayListOf(1,2,3,4,5,6)

    /*
    * O until ajuda a ir até o fim da lista sem precisar incluir o "-1" na lista assim como acontece no Java.
    * Segue um exemplo onde o -1 é utilizado:
    for(i in 0 .. numeros.size - 1) {
        println(numeros[i])
    }
    * A própria IDE já indica o uso do until para tratar os casos onde há a utilização de uma lista onde seja utilizada
    * o método "size" para percorrer os dados.
    */
    for(i in 0 until numeros.size) {
        println(numeros[i])
    }
}