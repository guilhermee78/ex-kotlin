fun main() {
    print("Digite o primeiro segmento: ")
    val a = readLine()!!.toDouble()

    print("Digite o segundo segmento: ")
    val b = readLine()!!.toDouble()

    print("Digite o terceiro segmento: ")
    val c = readLine()!!.toDouble()

    if (a + b > c && a + c > b && b + c > a) {
        print("Os segmentos podem formar um triângulo. ")

        if (a == b && b == c) {
            println("É um triângulo EQUILÁTERO.")
        } else if (a == b || a == c || b == c) {
            println("É um triângulo ISÓSCELES.")
        } else {
            println("É um triângulo ESCALENO.")
        }
    } else {
        println("Os segmentos NÃO podem formar um triângulo.")
    }
}
