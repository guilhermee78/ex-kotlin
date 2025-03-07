fun main() {
    print("Digite o primeiro valor: ")
    val valor1 = readLine()!!.toInt()
    print("Digite o segundo valor: ")
    val valor2 = readLine()!!.toInt()

    Maior(valor1, valor2)
}

fun Maior(a: Int, b: Int) {
    if (a > b) {
        println("O maior valor é: $a")
    } else if (b > a) {
        println("O maior valor é: $b")
    } else {
        println("Os dois valores são iguais.")
    }
}
