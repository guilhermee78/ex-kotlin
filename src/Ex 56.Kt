fun main() {
    var soma = 0
    var numero: Int

    println("Digite números para somar. Digite 1111 para parar.")

    do {
        print("Digite um número: ")
        numero = readLine()!!.toInt()

        if (numero != 1111) {
            soma = soma + numero
        }
    } while (numero != 1111)

    println("A soma dos números digitados é: $soma")
}
