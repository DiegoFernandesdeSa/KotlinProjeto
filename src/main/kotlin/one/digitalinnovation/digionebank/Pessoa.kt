package one.digitalinnovation.digionebank

class Pessoa {
    var name: String = "Diego"
    var CPF: String = "383.876.908.-21"
    private set

    constructor()

    fun pessoaInfo() = "$name + $CPF"

}

fun main() {
    val Diego = Pessoa()

    println(Diego.pessoaInfo())


}