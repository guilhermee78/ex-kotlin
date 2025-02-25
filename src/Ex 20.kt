fun main() {
    print("Digite um número: ")
    val num = readln().toInt()
    if (num % 2 == 0) {
        println("$num é um número par!")
    } else {
        println("O  número $num é ÍMPAR..")
    }
}
