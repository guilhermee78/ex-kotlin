import kotlin.random.Random

fun main() {
    val numeroSecreto = Random.nextInt(1, 11)
    var tentativas = 4
    var acertou = false

    println("Adivinhe o número entre 1 e 10! Você tem 4 tentativas.")

    while (tentativas > 0) {
        println("Digite um número:")
        val palpite = readLine()!!.toInt()

        if (palpite == numeroSecreto) {
            println("Parabéns! Você acertou o número.")
            acertou = true
            break
        } else {
            println("Errou! Tente novamente.")
        }

        tentativas = tentativas - 1
        println("Tentativas restantes: $tentativas")
    }

    if (!acertou) {
        println("Você perdeu! O número era $numeroSecreto.")
    }
}
