package me.bdscampos

fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val jose = Funcionario("Jose", 1000.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(jose.nome, jose)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(joao.nome))
    println("===============")
    repositorio.findAll().forEach { println(it) }

    println("===============")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }

}