package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import java.util.*

class ImprimiRelatorioFuncionarios {
    companion object{
        fun imprime(funcionario: Funcionario){
            println(
            funcionario.toString()
            )
        }
    }
}