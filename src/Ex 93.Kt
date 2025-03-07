fun main() {
    print("Digite o valor de início: ")
    val inicio = readLine()!!.toInt()

    print("Digite o valor de fim: ")
    val fim = readLine()!!.toInt()

    print("Digite o valor de incremento: ")
    val incremento = readLine()!!.toInt()

    Contador(inicio, fim, incremento)
}

fun Contador(inicio: Int, fim: Int, incremento: Int) {
    if (incremento > 0) {
        for (i in inicio..fim step incremento) {
            print("$i ")
        }
    } else {
        println("O incremento deve ser um valor positivo.")
    }
}
