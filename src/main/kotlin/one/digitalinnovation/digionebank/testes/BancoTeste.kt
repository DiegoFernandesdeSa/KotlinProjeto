package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main() {
    val digionebank = Banco(nome = "Digione", numero =  12)

    println(digionebank.nome)
    println(digionebank.numero)

    val Banco2 = digionebank.copy(nome = "Banco 02")

    println(Banco2.Info())

}