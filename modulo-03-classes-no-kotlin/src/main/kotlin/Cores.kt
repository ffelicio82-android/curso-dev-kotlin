/*
 * Enum complexo
 *
 * A forma abaixo dá a possibilidade de trabalhar utilizando valores nas constantes.
 * Também é possível utilizar métodos
 */

// Para poder usar valores nas constantes, é necessário passar um valor no construtor
enum class Cores(val rgb: Int) {
    RED(0xFF0000),
    GREEN(rgb = 0x00FF00),
    BLUE(rgb = 0x0000FF); // Aqui é o único momento obrigatório do uso do ponto e vírgula no Kotlin. Ele serve para separar a estrutura das constantes e os métodos

    fun getColor() : String {
        return this.toString()
    }
}