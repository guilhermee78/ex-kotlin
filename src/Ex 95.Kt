fun main() {
    print("Digite o número de termos da sequência de Fibonacci: ")
    val termos = readLine()!!.toInt()

    Fibonacci(termos)
}

fun Fibonacci(n: Int) {
    var a = 0
    var b = 1
    for (i in 1..n) {
        if (i != n) {
            print("$a >> ")
        } else {
            print("$a >> FIM")
        }
        val temp = a
        a = b
        b = temp + b
    }
}
