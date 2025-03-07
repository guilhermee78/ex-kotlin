fun main() {
    print("Digite o primeiro valor: ")
    val valor1 = readLine()!!.toInt()

    print("Digite o segundo valor: ")
    val valor2 = readLine()!!.toInt()

    val resultado = Somador(valor1, valor2)
    println("A soma entre $valor1 e $valor2 é: $resultado")
}

fun Somador(a: Int, b: Int): Int {
    return a + b
}
