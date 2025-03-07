import kotlin.random.Random

fun main() {
    val vetor = IntArray(7)

    for (i in 0..6) {
        vetor[i] = Random.nextInt(1, 101)
    }

    for (i in 0..6) {
        print("Índice $i: ${vetor[i]} ")
    }
    println()
}
