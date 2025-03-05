fun main() {
    print("Digite um valor: ")
    val numero = readLine()!!.toInt()

    if (numero <= 0) {
        println("Por favor, digite um número positivo.")
    } else {
        print("Contagem: ")
        for (i in 1..numero) {
            print("$i ")
        }
        println("Acabou!")
    }
}
