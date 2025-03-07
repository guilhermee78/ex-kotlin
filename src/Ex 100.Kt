fun main() {
    print("Digite a primeira nota: ")
    val nota1 = readLine()!!.toDouble()

    print("Digite a segunda nota: ")
    val nota2 = readLine()!!.toDouble()

    val media = Media(nota1, nota2)
    println("Média: $media")

    val situacao = Situacao(media)
    println("Situação: $situacao")
}

fun Media(nota1: Double, nota2: Double): Double {
    return (nota1 + nota2) / 2
}

fun Situacao(media: Double): String {
    return when {
        media >= 7 -> "APROVADO"
        media >= 5 -> "RECUPERAÇÃO"
        else -> "REPROVADO"
    }
}
