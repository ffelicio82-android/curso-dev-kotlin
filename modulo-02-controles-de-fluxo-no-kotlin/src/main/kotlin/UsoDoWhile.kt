/*
 * While
 *
 * Assim como no Java, o Kotlin possui a instrução while para percorrer os dados.
 * Além do while, o Kotlin também possui o do/while
 * Eles servem para o mesmo propósito, mas a diferença entre eles é que o do/while executa a instrução ao menos uma vez.
 */
fun main() {
    var a : Int = 10

    while(a > 0) {
        println(a)
        a--
    }

    println()
    println("------------------------------------")
    println()

    var b : Int = 10
    do {
        println(b)
        b--
    } while(b > 0)

    println()
    println("------------------------------------")
    println()

    /*
     * No código abaixo, a instrução dentro do while não será executada devido a verificação realizada
     */
    var c : Int = 0
    while(c > 0) {
        // não será executada a instrução
        println(c)
        c--
    }

    println()
    println("------------------------------------")
    println()

    /*
     * No código abaixo, a instrução dentro do do/while será executada ao menos uma vez
     * mesmo que a verificação dentro do while esteja analisando se o valor é maior que 0
     */
    var d : Int = 0
    do {
        // executa a instrução ao menos uma vez, mesmo que o valor seja 0
        println(d)
        d--
    } while(d > 0)
}