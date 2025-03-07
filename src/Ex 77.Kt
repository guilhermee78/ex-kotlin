fun main() {
    val nomes = Array(7) { "" }

    for (i in 0..6) {
        print("Digite o nome ${i + 1}: ")
        nomes[i] = readLine() ?: ""
    }

    for (i in 6 downTo 0) {
        print("Índice $i: ${nomes[i]} ")
    }
    println()
}
