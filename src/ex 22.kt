fun main() {
    println("Em que ano você nasceu?  ")
    val anoNascimento = readln().toInt()
    val anoAtual = 2025
    val idade = anoAtual - anoNascimento
    if (idade < 18) {
        val AnosFaltando = 18 - idade
        println("Faltam $AnosFaltando anos para você poder se alistar")
    } else if (idade == 18) {
        println("Você deve se alistar esse ano!")
    } else {
        val anosPassados = idade - 18
        println("Você já deveria ter se alistado há $anosPassados anos")
    }
}
