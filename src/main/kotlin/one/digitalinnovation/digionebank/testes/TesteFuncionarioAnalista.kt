package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main() {
    val Joao = Analista("Joao Pedro", "123.456.786-99", 2000.0)
    ImprimiRelatorioFuncionarios.imprime(Joao)

}
