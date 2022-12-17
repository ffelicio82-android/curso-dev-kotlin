val oneByte : Byte = 1 // De -128 até 127
val oneShort : Short = 1 // De -32768 até 32767
val oneInt = 1 // Infere o tipo como inteiro
val oneLong1 : Long = 1 // Forma 1 de criação de uma variável do tipo Long
val oneLong2 = 1L // Forma 2 de criação de uma variável do tipo Long
val oneLong3 = 100_000_000 // Forma 2 de criação de uma variável do tipo Long

val oneFloat1 : Float = 1F // Forma 1 de criação de uma variável do tipo Float. Caso está definido, é obrigatório utilizar a letra "F" no múmero (mesmo se a variável esteja definida explicitamente)
val oneFloat2 = 1F // Forma 2 de criação de uma variável do tipo Float. Aqui não é informado o tipo da variável, mas caso queira utilizar um float, basta incluir a letra F a frente do número

/*
    Para casos onde é necessário utilizar valores com ponto flutuante, é melhor utilizar o Double ou o Float (dar preferência ao Float.
 */
val oneDouble1 : Double = 1.0 // Forma 1 de criação de uma variável do tipo Double. Neste caso é obrigatório incluir o ".0" no valor da variável
val oneDouble2 = 1.0 // Forma 2 de criação de uma variável do tipo Long

val hexByte = 0xFF_FF_FF

val flag : Boolean = true

val sequencia: Array<Int> = arrayOf(1, 2, 3, 4)

val nome: String = "Fernando"

// Forma de declarar a string em múltiplas linhas (triple quotes)
val teste: String = """
    Test 1
    Teste 2
    Teste 3
""".trimIndent()

// String template
val valor = "oneInt é igual a: $oneInt"

fun main() {
    println(oneByte.javaClass)
    println(oneShort.javaClass)
    println(oneInt.javaClass)
    println(oneLong1.javaClass)
    println(oneLong2.javaClass)
    println(oneLong3.javaClass)

    println(oneFloat1.javaClass)
    println(oneFloat2.javaClass)

    println(oneDouble1.javaClass)
    println(oneDouble2.javaClass)

    println(hexByte.javaClass)

    println(flag.javaClass)
    println(sequencia.javaClass)

    println(nome.javaClass)
    println(sequencia.javaClass)

    println(nome.javaClass)
    println(teste.javaClass)
    println(teste)

    println(valor.javaClass)
    println(valor)
}