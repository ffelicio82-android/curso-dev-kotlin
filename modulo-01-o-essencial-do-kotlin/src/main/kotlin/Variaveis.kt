/*
    Variáveis

    val - são variáveis finais, ou seja, nào podem ser alteradas. As mesmas funcionam como constantes
    var - são variáveis que podem ser alteradas normalmente (tomar cuidado com o tipo)
*/

fun main() {
    // ------------- val ------------- \\
    val nome: String = "Fernando"
    println("nome = $nome")
    // por ser definido como val, não pode ser realizada a alteração na forma abaixo:
    // nome = "Felicio" // É gerado o erro em tempo de compilação com a mensagem "Val cannot be reassigned"

    // ------------- var ------------- \\
    var idade: Int = 40
    println("nome = $nome | idade: $idade")

    // por ser definido como var, o valor pode ser redefinido normalmente
    idade += 1
    println("nome = $nome | idade: $idade")

    // ------------- Observação ------------- \\
    // O Kotlin não aceita receber null como valor padrão, exemplo (descomentar as 2 linhas seguintes para ver o erro)
    // var sobrenome : String
    // println("nome = $nome | idade: $idade | sobrenome: $sobrenome")
    // Na instrução acima, é gerado um erro porque a variável "sobrenome" foi definida, mas não foi atribuído valor
    // em tempo de compilação é mostrada a mensagem de erro "Variable 'sobrenome' must be initialized"

    // Uma alternativa que pode ser feita, é utilizar o recurso de inicialização tardia, exemplo abaixo:
    lateinit var profissao : String // Obrigatório informar o tipo da variável

    // Usando o formato de inicialização tardia, a atribuição do valor pode ser feita posteriormente, exemplo
    profissao = "Programador"
    println("nome = $nome | idade: $idade | profissao: $profissao")

    // Mesmo utilizando o formato de atribuição tardia, deverá ser realizada a atribuição do valor antes de seu uso.
    // Devido a natureza do Kotlin não aceitar valores nulos como padrão, caso seja utilizada a variável sem a sua atribuição,
    // será mostrado erro em tempo de de execução com a seguinte mensagem:
    /*
        Exception in thread "main" kotlin.UninitializedPropertyAccessException: lateinit property teste has not been initialized
     */
    // Descomentar as 2 linhas abaixo e rodar para ver o erro gerado
    // lateinit var teste : String
    // println("teste = $teste")

    // Caso ainda sim, exista a necessidade da utilização do nulo, pode ser feita a atribuição da forma abaixo:
    var escola : String? = null // O interrogação na frente do tipo indica que a variável pode receber nulo
    println("nome = $nome | idade: $idade | profissao: $profissao | escola: $escola")

    // Reatribuição do valor
    escola = "Escola"
    println("nome = $nome | idade: $idade | profissao: $profissao | escola: $escola")

    // Outro detalhe a ser considerado é que, mesmo ser a variável for definida como "var", a referência da mesma não
    // poderá ser reutilizada.
    // Por ser uma linguagem fortemente tipada, não pode ser realizada a ação abaixo (descomentar para ver o erro):
    // var idade = 50 // Erro informado: "Conflicting declarations: var idade: Int, var idade: Int"
}