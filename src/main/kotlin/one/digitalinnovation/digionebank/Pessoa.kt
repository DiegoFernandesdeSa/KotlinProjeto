package one.digitalinnovation.digionebank

class Pessoa {
    var name: String = "Diego"

    var CPF: String = "383.876.908.-21"
    private set

}

fun main() {
    val Diego = Pessoa()

    println(Diego.name)
    println(Diego.CPF)


}