fun main() {
    val vetor = IntArray(10)

    for (i in 0..9) {
        vetor[i] = (i + 1) * 5
    }

    for (i in 0..9) {
        print("${i} ")
    }
    println()

    for (i in 0..9) {
        print("${vetor[i]} ")
    }
    println()
}
