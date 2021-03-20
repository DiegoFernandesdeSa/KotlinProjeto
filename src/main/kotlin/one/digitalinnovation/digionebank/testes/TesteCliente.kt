package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    val Jose = Cliente(
        nome = "Jose da Silva",
        cpf = "123.456.789-00",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(Jose)
    TesteAutenticacao().Autentica(Jose)
}



