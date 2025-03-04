import kotlin.random.Random

fun main() {
    println("Escolha uma opção:")
    println("1. Pedra")
    println("2. Papel")
    println("3. Tesoura")
    
    val escolhaJogador = readLine()!!.toInt()

    val escolhaComputador = Random.nextInt(3) + 1

    println("\nVocê escolheu: $escolhaJogador")
    println("O computador escolheu: $escolhaComputador")

    if (escolhaJogador == escolhaComputador) {
        println("Empate!")
    } else if (escolhaJogador == 1 && escolhaComputador == 3 ||
               escolhaJogador == 2 && escolhaComputador == 1 ||
               escolhaJogador == 3 && escolhaComputador == 2) {
        println("Você ganhou!")
    } else {
        println("Você perdeu!")
    }
}
