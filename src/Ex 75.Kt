fun main() {
    val vetor = IntArray(15)

    vetor[0] = 1
    vetor[1] = 1

    for (i in 2 until 15) {
        vetor[i] = vetor[i - 1] + vetor[i - 2]
    }

    for (i in 0 until 15) {
        print("${vetor[i]} ")
    }
    println()

    for (i in 0 until 15) {
        print("$i ")
    }
    println()
}
