package me.bdscampos

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
) {
    override fun toString() = """
        Nome:    $nome
        Salario: $salario
    """.trimIndent()
}
