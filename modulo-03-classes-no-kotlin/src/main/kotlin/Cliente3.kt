/*
 * Classes
 *
 * Pacotes
 *
 * O Kotlin também possibilita o uso de pacotes, mas ele possui a característica de não obrigar a seguir uma estrutura de pastas
 * em que os arquivos estão (No Java isso é obrigatório).
 * Pacotes criados sem seguir a hierarquia de pastas é considerada uma má prática
 */
package br.com.cursodekotlin.pacote1

import java.util.Date

/*
 * Classes
 */

class Cliente3(
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