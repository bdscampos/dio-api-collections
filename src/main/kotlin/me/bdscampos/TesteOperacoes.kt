package me.bdscampos

fun main() {
    val salarios = doubleArrayOf(6000.0, 2000.0, 3000.0)

    for (salario in salarios){ println(salario) }

    println("============")
    println("Salario medio: ${salarios.average()}")
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")

    val salariosMaiorQue = salarios.filter { it > 2500 }
    println("===========")
    salariosMaiorQue.forEach { println(it) }

    println("===========")
    println(salarios.count { it in 2500.0..7000.0 })

    println("===========")
    println(salarios.find { it == 2000.0 })
    println(salarios.find { it == 2500.0 })

    println("===========")
    println(salarios.any { it == 3000.0 })
}