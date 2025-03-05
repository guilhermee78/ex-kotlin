fun main() {
    var totalIdade = 0
    var homens = 0
    var mulheres = 0
    var idadeHomens = 0
    var mulheresMais20 = 0

    for (i in 1..5) {
        println("Digite a idade da $i ª pessoa:")
        val idade = readLine()!!.toInt()
        println("Digite o sexo da $i ª pessoa (M/F):")
        val sexo = readLine()!!

        totalIdade += idade

        if (sexo == "M") {
            homens += 1
            idadeHomens += idade
        }

        if (sexo == "F") {
            mulheres += 1
            if (idade > 20) {
                mulheresMais20 += 1
            }
        }
    }

    val mediaIdade = totalIdade / 5
    var mediaIdadeHomens = 0
    if (homens > 0) {
        mediaIdadeHomens = idadeHomens / homens
    }

    println("Homens cadastrados: $homens")
    println("Mulheres cadastradas: $mulheres")
    println("Média de idade do grupo: $mediaIdade")
    println("Média de idade dos homens: $mediaIdadeHomens")
    println("Mulheres com mais de 20 anos: $mulheresMais20")
}
