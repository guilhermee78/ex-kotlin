fun main() {
    val numeros = IntArray(10)

    for (i in 0..9) {
        print("Digite o número ${i + 1}: ")
        numeros[i] = readLine()!!.toInt()
    }

    for (i in 0..9) {
        print("$i ")
    }
    println()

    for (i in 0..9) {
        print("${numeros[i]} ")
    }
    println()

    println("Números pares e suas posições:")
    for (i in 0..9) {
        if (numeros[i] % 2 == 0) {
            println("Índice $i: ${numeros[i]}")
        }
    }
}
