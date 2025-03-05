// Aluguel de Carros

fun main() {
    println("Digite o tipo de carro (popular ou luxo):")
    val tipoCarro = readln().lowercase()

    println("Quantos dias de aluguel?")
    val dias = readln().toInt()

    println("Quantos Km foram percorridos?")
    val km = readln().toFloat()

    val precoDiaria = if (tipoCarro == "popular") 90 else 150
    val precoKm = when {
        tipoCarro == "popular" && km <= 100 -> 0.20f
        tipoCarro == "popular" -> 0.10f
        tipoCarro == "luxo" && km <= 200 -> 0.30f
        else -> 0.25f
    }

    val total = (dias * precoDiaria) + (km * precoKm)

    println("O total a pagar é: R$%.2f".format(total))
}
