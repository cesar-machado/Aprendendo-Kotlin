fun main() {
    println("Bem vindo ao Bytebank")

    val alex = Funcionarios(nome = "Alex", cpf = "333.333.222.11", salario = 1000.0  )

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("Salário ${alex.salario}")
    println("Bonificação ${alex.bonificacao()} ")
}


