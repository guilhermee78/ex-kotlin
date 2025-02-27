fun main() {
    println("Digite sua primeira nota: ")
    val nota1 = readln().toFloat()

    println("Digite a segunda nota: ")
    val nota2 = readln().toFloat()

    val media = (nota1 + nota2) / 2

    if (media <= 4.9) {
        println("Reprovado!")
    } else if (media >= 5.0 && media <= 6.9) {
        println("Recuperação!")
    } else {
        println("Aprovado!")
    }
}
