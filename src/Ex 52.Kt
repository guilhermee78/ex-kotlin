fun main() {
    var somaIdades = 0
    var maiorIdade = 0
    var pessoasMaiorDe18 = 0
    var pessoasMenorDe5 = 0

    for (i in 1..10) {
        print("Digite a idade da ${i}ª pessoa: ")
        val idade = readLine()!!.toInt()

        somaIdades += idade

        if (idade > maiorIdade) {
            maiorIdade = idade
        }

        if (idade > 18) {
            pessoasMaiorDe18++
        }

        if (idade < 5) {
            pessoasMenorDe5++
        }
    }

    val mediaIdade = somaIdades / 10.0

    println("Média de idade do grupo: $mediaIdade")
    println("Número de pessoas com mais de 18 anos: $pessoasMaiorDe18")
    println("Número de pessoas com menos de 5 anos: $pessoasMenorDe5")
    println("Maior idade: $maiorIdade")
}
