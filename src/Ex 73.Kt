fun main() {
    val vetor = IntArray(10)

    for (i in 0..9) {
        vetor[i] = 9 - i
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
