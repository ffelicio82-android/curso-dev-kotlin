import java.util.Date

/*
 * Classes
 *
 * São descrições que abstraem um conjunto de objetos com características similares
 * Descrevem as propriedades/atributos possíveis e ações/comportamentos/métodos de um conjunto de objetos
 *
 * Características
 *
 * As classes no Kotlin por padrão são públicas(diferente de Java que são privadas)
 * Para deixar a classe privada no Kotlin deverá ser definida conforme abaixo;
 *
 * private class Teste {
 *      ...
 *      ...
 * }
 *
 * Por padrão o Kotlin já tem os métodos get/set
 */

class Cliente(
    var nome : String,
    val sobrenome: String,
    val dataNascimento: Date,
    val dataCadastro: Date,
) {

    // método executado toda vez que um objeto é criado
    init {
        println("método init - executado toda a vez que um objeto é criado")
    }

    fun getNomeCompleto() : String {
        return "$nome $sobrenome"
    }
}