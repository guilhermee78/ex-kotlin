fun main() {
    var maiorIdade = 0
    var homens = 0
    var somaIdadeHomens = 0
    var idadeMulherMaisJovem = -1
    var continuar = "S"
    var mediaIdadeHomens = 0

    while (continuar == "S") {
        print("Digite a idade: ")
        val idade = readLine()!!.toInt()

        print("Digite o sexo (M/F): ")
        val sexo = readLine()!!.uppercase()

        if (idade > maiorIdade) {
            maiorIdade = idade
        }

        if (sexo == "M") {
            homens++
            somaIdadeHomens += idade
        } else if (sexo == "F") {
            if (idadeMulherMaisJovem == -1 || idade < idadeMulherMaisJovem) {
                idadeMulherMaisJovem = idade
            }
        }

        print("Deseja continuar? (S/N): ")
        continuar = readLine()!!.uppercase()
    }

    if (homens > 0) {
        mediaIdadeHomens = somaIdadeHomens / homens
    }

    println("Maior idade lida: $maiorIdade")
    println("Quantidade de homens cadastrados: $homens")
    
    if (idadeMulherMaisJovem != -1) {
        println("Idade da mulher mais jovem: $idadeMulherMaisJovem")
    } else {
        println("Nenhuma mulher cadastrada")
    }
    
    println("Média de idade dos homens: $mediaIdadeHomens")
}
