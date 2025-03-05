fun main() {
    var nomeMaisVelho = ""
    var idadeMaisVelho = 0
    var nomeMulherMaisJovem = ""
    var idadeMulherMaisJovem = -1
    var somaIdades = 0
    var totalPessoas = 0
    var homensComMaisDe30 = 0
    var mulheresComMenosDe18 = 0
    var continuar = "S"

    while (continuar == "S") {
        print("Digite o nome: ")
        val nome = readLine()!!

        print("Digite a idade: ")
        val idade = readLine()!!.toInt()

        print("Digite o sexo (M/F): ")
        val sexo = readLine()!!.uppercase()

        somaIdades += idade
        totalPessoas++

        if (idade > idadeMaisVelho) {
            idadeMaisVelho = idade
            nomeMaisVelho = nome
        }

        if (sexo == "F" && (idadeMulherMaisJovem == -1 || idade < idadeMulherMaisJovem)) {
            idadeMulherMaisJovem = idade
            nomeMulherMaisJovem = nome
        }

        if (sexo == "M" && idade > 30) {
            homensComMaisDe30++
        }

        if (sexo == "F" && idade < 18) {
            mulheresComMenosDe18++
        }

        print("Deseja continuar? (S/N): ")
        continuar = readLine()!!.uppercase()
    }

    val mediaIdade = if (totalPessoas > 0) somaIdades / totalPessoas else 0

    println("Nome da pessoa mais velha: $nomeMaisVelho")
    println("Nome da mulher mais jovem: $nomeMulherMaisJovem")
    println("Média de idade do grupo: $mediaIdade")
    println("Homens com mais de 30 anos: $homensComMaisDe30")
    println("Mulheres com menos de 18 anos: $mulheresComMenosDe18")
}
