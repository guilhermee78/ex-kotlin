fun main() {
    val vetor = IntArray(20)

    for (i in 0 until 20) {
        vetor[i] = (0..99).random()
    }

    println("Números gerados:")
    for (num in vetor) {
        print("$num ")
    }

    vetor.sort()

    println("\nNúmeros ordenados:")
    for (num in vetor) {
        print("$num ")
    }
}
