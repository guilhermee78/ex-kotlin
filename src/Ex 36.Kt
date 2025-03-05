// Pontos por atividade física
fun main() {
    println("Quantas horas de atividade física você fez no mês?")
    val horas = readln().toInt()

    val pontos = when {
        horas <= 10 -> horas * 2
        horas <= 20 -> horas * 5
        else -> horas * 10
    }

    val dinheiro = pontos * 0.05
    println("Você ganhou $pontos pontos e recebeu R$%.2f".format(dinheiro))
}
