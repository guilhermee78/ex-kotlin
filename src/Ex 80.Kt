import kotlin.random.Random

fun main() {
    val vetor = IntArray(30)

    for (i in 0..29) {
        vetor[i] = Random.nextInt(1, 16)
    }

    print("Digite o número (chave) para buscar: ")
    val chave = readLine()!!.toInt()

    var count = 0
    println("Posições onde a chave foi encontrada:")
    for (i in 0..29) {
        if (vetor[i] == chave) {
            println("Índice $i")
            count++
        }
    }

    if (count > 0) {
        println("A chave $chave foi sorteada $count vezes.")
    } else {
        println("A chave $chave não foi sorteada.")
    }
}
