
import br.com.cursodekotlin.pacote1.Cliente3
import java.util.*

fun main() {
    println("----------------------- Exemplo 1 -----------------------")
    val cliente1: Cliente = Cliente(nome = "Fernando",  sobrenome = "Felicio", dataNascimento = Date(), dataCadastro = Date())
    val cliente2: Cliente = Cliente(nome = "Jordana",  sobrenome = "de Souza", dataNascimento = Date(), dataCadastro = Date())

    println(cliente1.getNomeCompleto())
    println(cliente2.getNomeCompleto())

    println("----------------------- Exemplo 2 -----------------------")

    val cliente3: Cliente2 = Cliente2(nome = "Nick",  sobrenome = "Felicio", idade = 40, dataCadastro = Date())
    println("Nome completo: ${cliente3.getNomeCompleto()}\nÉ maior? ${cliente3.temMaioridade}\nÉ idoso? ${cliente3.ehIdoso}")

    println("----------------------- Exemplo 3 -----------------------")

    val cliente4: Cliente3 = Cliente3(nome = "Duke", sobrenome = "Felicio", dataNascimento = Date(), dataCadastro = Date())
    println("Nome completo: ${cliente4.getNomeCompleto()}")

    println("----------------------- Exemplo 4 - USO DO ENUM -----------------------")

    val constanteSimples : Direcoes = Direcoes.LESTE
    println("Direção: $constanteSimples")

    val constanteComplexa : Cores = Cores.BLUE
    println("COR(constante): ${constanteComplexa.getColor()}\nCOR(rgb): ${constanteComplexa.rgb}")
}