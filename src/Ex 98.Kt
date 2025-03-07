fun main() {
    print("Digite o primeiro número: ")
    val numero1 = readLine()!!.toInt()

    print("Digite o segundo número: ")
    val numero2 = readLine()!!.toInt()

    print("Digite o terceiro número: ")
    val numero3 = readLine()!!.toInt()

    val maior = Maior(numero1, numero2, numero3)
    println("O maior número entre $numero1, $numero2 e $numero3 é: $maior")
}

fun Maior(a: Int, b: Int, c: Int): Int {
    return maxOf(a, b, c)
}
