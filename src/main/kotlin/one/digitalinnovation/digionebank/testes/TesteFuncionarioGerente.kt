package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val Maria = Gerente("Maria do Carmo", "123.456.786-99", 5000.0, "senha123")

    ImprimiRelatorioFuncionarios.imprime(Maria)

    TesteAutenticacao().Autentica(Maria)

}


