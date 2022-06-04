package me.bdscampos

fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val jose = Funcionario("Jose", 1000.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    println("======== LIST ==========")
    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("==================")
    funcionarios.add(jose)
    funcionarios.forEach { println(it) }
    println("==================")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }

    println("======== SET ==========")
    val funcionarios2 = mutableSetOf(maria)
    funcionarios2.forEach{ println(it) }

    funcionarios2.add(jose)
    funcionarios2.add(joao)

    println("==================")
    funcionarios2.forEach{ println(it) }

    println("======== SET ==========")
    funcionarios2.remove(maria)
    funcionarios2.forEach{ println(it) }
}