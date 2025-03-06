//68- Crie um programa que leia sexo e peso de 8 pessoas, usando a estrutura “para”
//No final, mostre na tela:
//Quantas mulheres foram cadastradas
//•Quantos homens pesam mais de 100Kg
//• A média de peso entre as mulheres
//• O maior peso entre os homens

fun main() {
    var maisDe100 = 0
    var mulheres = 0
    var somaPesosMulheres = 0
    var maiorPesoHomens = 0

    for (i in 1..8) {
        println("Pessoa $i | Qual o seu gênero? (M para Masculino / F para Feminino)")
        val genero = readln().uppercase() // maiúsculas para nn ter erro
        println("Qual o seu peso? ")
        val peso = readln().toInt()

        if (genero == "M") {
            if (peso > 100) {
                maisDe100++
            }
            if (peso > maiorPesoHomens) {
                maiorPesoHomens = peso // o maior ps entre homens
            }
        } else if (genero == "F") {
            mulheres++
            somaPesosMulheres += peso
        }
    }
    val mediaF = if (mulheres > 0) somaPesosMulheres / mulheres else 0

    println("Quantas mulheres cadastradas: $mulheres")
    println("Média dos pesos entre as mulheres: $mediaF kg")
    println("Quantos homens pesam mais de 100kg? $maisDe100")
    println("Maior peso entre os homens: $maiorPesoHomens kg")
}
