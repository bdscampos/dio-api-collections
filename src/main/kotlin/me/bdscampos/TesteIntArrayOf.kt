package me.bdscampos

fun main() {
    val values = intArrayOf(5, 3, 4, 10, 1, 7)

    values.forEach { println(it) }

    println("Sorted")
    values.sort()
    values.forEach { println(it) }
}