package me.bdscampos

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "Maria"
    nomes[1] = "Bruno"
    nomes[2] = "Thais"

    for (nome in nomes){
        println(nome)
    }

    println("==Sorted==")
    nomes.sort()
    nomes.forEach { println(it) }

    val nomes2 = arrayOf("Maria", "Bruno", "Thais")

    println("==Array 2 Sorted")
    nomes2.sort()
    nomes2.forEach { println(it) }
}