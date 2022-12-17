fun main() {
    var idade : Int = 10
    val idadeMinima : Int = 18

    // Forma tradicional
    if(idade < idadeMinima) {
        println("menor idade")
    } else {
        println("maior idade")
    }

    idade = 20

    // Usando no formato de lambda function
    // Nessa forma, o valor será armazenado diretamente na variável de acordo com o retorno do if/else
    val mensagem : String = if(idade < idadeMinima) {
        println("verificação menor idade")
        // Pode ter outras execuções antes do retorno
        // ...
        // ...
        // ...
        // ...
        "menor idade"
    } else {
        // Pode ter outras execuções antes do retorno
        // ...
        // ...
        // ...
        // ...
        println("verificação maior idade")
        "maior idade"
    }

    println(mensagem)
}