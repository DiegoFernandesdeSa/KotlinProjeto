package one.digitalinnovation.digionebank

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double
) : Pessoa(nome, cpf) {
    protected abstract fun CalculoAuxilio(): Double

    override fun toString(): String = """
    Nome:      $nome
    CPF:       $cpf
    Salário:   $salario
    Auxilio:   ${CalculoAuxilio()}
    """.trimIndent()

}