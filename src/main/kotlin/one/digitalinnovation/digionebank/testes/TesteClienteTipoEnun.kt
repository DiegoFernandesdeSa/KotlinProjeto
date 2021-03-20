package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.Descricao}")

        ClienteTipo.values().forEach {
            println("${it.name} - ${it.Descricao}")
        }

        val PF = ClienteTipo.PF
        println("${PF.name} - ${PF.Descricao}")

        val PJ = ClienteTipo.PJ
        println("${PJ.name} - ${PJ.Descricao}")
    }
}
