fun main() {
    print("Digite o primeiro valor: ")
    val inicio = readLine()!!.toInt()

    print("Digite o último valor: ")
    val fim = readLine()!!.toInt()

    print("Digite o incremento: ")
    val incremento = readLine()!!.toInt()

    print("Contagem: ")
    var i = inicio
    while (i <= fim) {
        print("$i ")
        i += incremento
    }
    println("Acabou!")
}