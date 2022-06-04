package me.bdscampos

fun main() {
    val joao = Funcionario("Joao", 2000.0, "CLT")
    val jose = Funcionario("Jose", 1000.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios1 = setOf(joao, jose)
    val funcionarios2 = setOf(maria)

    val resultUnion = funcionarios1.union(funcionarios2)
    resultUnion.forEach{ println(it) }

    println("==============")
    val funcionarios3 = setOf(joao, jose, maria)
    val resultSubtraction = funcionarios3.subtract(funcionarios1)
    resultSubtraction.forEach{ println(it) }

    println("==============")
    val resultIntersection = funcionarios3.intersect(funcionarios1)
    resultIntersection.forEach{ println(it) }

}