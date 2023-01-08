import java.util.Date

/*
 * Classes
 *
 * Assessores customizados
 *
 * Assessores customizados são uma forma de declaração de atributos que são comuptados em tempo de execução
 */

class Cliente2(
    var nome : String,
    val sobrenome: String,
    val idade: Int,
    val dataCadastro: Date,
) {
    // Exemplo de assessor customizado
    val temMaioridade : Boolean
        get() {
            return this.idade >= 18
        }

    // Outra forma de escrita do assessor customizado (escrevendo o retorno de forma reduzida)
    val ehIdoso : Boolean
        get() = this.idade >= 60

    // O método abaixo faz a mesma operação que a instrução acima, apenas está escrita de forma diferente
    fun temMaioridade() : Boolean = this.idade >= 18

    fun getNomeCompleto() : String {
        return "$nome $sobrenome"
    }
}