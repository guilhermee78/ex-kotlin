fun main() {
    println("Digite o comprimento do primeiro lado:")
    val lado1 = readln().toFloat()

    println("Digite o comprimento do segundo lado:")
    val lado2 = readln().toFloat()

    println("Digite o comprimento do terceiro lado:")
    val lado3 = readln().toFloat()

    
    if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
        println("Os segmentos podem formar um triângulo!")
    } else {
        println("Os segmentos NÃO podem formar um triângulo.")
    }
}
