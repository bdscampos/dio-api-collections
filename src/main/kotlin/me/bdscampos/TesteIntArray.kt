package me.bdscampos

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 5
    values[2] = 4
    values[3] = 2
    values[4] = 3

    println("Iterating using values")
    for (valor in values){
        println(valor)
    }

    println("Using for each")
    values.forEach {
        println(it)
    }

    println("Iterating using indexes")
    for (index in values.indices){
        println(values[index])
    }

    println("Sorting")
    values.sort()
    for (valor in values){
        println(valor)
    }
}