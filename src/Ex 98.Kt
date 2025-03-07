fun main() {
    print("Digite o primeiro número: ")
    val numero1 = readLine()!!.toInt()

    print("Digite o segundo número: ")
    val numero2 = readLine()!!.toInt()

    val soma = SuperSomador(numero1, numero2)
    println("A soma dos números entre $numero1 e $numero2 é: $soma")
}

fun SuperSomador(a: Int, b: Int): Int {
    var soma = 0
    for (i in a..b) {
        soma += i
    }
    return soma
}
