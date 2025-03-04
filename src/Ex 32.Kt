import kotlin.random.Random

fun main() {
    val numeroSorteado = Random.nextInt(1, 6)
    println("Tente adivinhar o número sorteado entre 1 e 5:")
    val tentativaJogador = readLine()!!.toInt()

    if (tentativaJogador == numeroSorteado) {
        println("Parabéns! Você acertou! O número sorteado foi $numeroSorteado.")
    } else {
        println("Você errou! O número sorteado foi $numeroSorteado. Tente novamente!")
    }
}
