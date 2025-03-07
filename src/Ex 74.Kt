fun main() {
    val vetor = IntArray(10)

    for (i in 0..9) {
        vetor[i] = if (i % 2 == 0) 5 else 3
    }

    for (i in 0..9) {
        print("${vetor[i]} ")
    }
    println()

    for (i in 0..9) {
        print("$i ")
    }
    println()
}
