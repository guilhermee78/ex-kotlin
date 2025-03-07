fun main() {
    val numeros = IntArray(15)

    for (i in 0..14) {
        print("Digite o número ${i + 1}: ")
        numeros[i] = readLine()!!.toInt()
    }

    for (i in 0..14) {
        print("$i ")
    }
    println()

    for (i in 0..14) {
        print("${numeros[i]} ")
    }
    println()

    for (i in 0..14) {
        if (numeros[i] % 10 == 0) {
            println("Índice $i: ${numeros[i]}")
        }
    }
}
