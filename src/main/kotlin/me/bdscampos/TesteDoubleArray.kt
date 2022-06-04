package me.bdscampos

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 2000.0
    salarios[1] = 3000.0
    salarios[2] = 1000.0

    salarios.forEach { println(it) }

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }

    println("===10% increase===")
    salarios.forEach { println(it) }

    val salarios2 = doubleArrayOf(2000.0, 3000.0, 1000.0)

    println("===Sorted===")
    salarios2.sort()
    salarios2.forEach { println(it) }

}