fun main() {
    println("Digite a largura do terreno (em metros):")
    val largura = readln().toFloat()

    println("Digite o comprimento do terreno (em metros):")
    val comprimento = readln().toFloat()

    val area = largura * comprimento

    println("A área do terreno é: ${area}m²")

    if (area < 100) {
        println("Classificação: TERRENO POPULAR")
    } else if (area <= 500) {
        println("Classificação: TERRENO MASTER")
    } else {
        println("Classificação: TERRENO VIP")
    }
}
