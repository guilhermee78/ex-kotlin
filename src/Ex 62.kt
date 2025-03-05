//62- Faça um programa usando a estrutura “faça enquanto” que leia a idade de
//várias pessoas. A cada laço, você deverá perguntar para o usuário se ele quer
//ou não continuar a digitar dados. No final, quando o usuário decidir parar,
//mostre na tela:
//• Quantas idades foram digitadas
//• Qual é a média entre as idades digitadas
//• Quantas pessoas tem 21 anos ou mais.

fun main() {
    var i = 0
    var idades = 0
    var media = 0
    var idd = 0 //idade de cada pessoa
    var maior21 = 0  //
    var continuar = "sim"

    while (continuar == "sim") {

        println("Digite a idade da pessoa $i:")
        idd = readln().toInt()
        idades += idd
        i++

        if (idd >= 21) {
            maior21++
        }

        println("Deseja continuar? (sim/não)")
        continuar = readln()
    }

    media = idades / i 

    println("Quantas idades foram digitadas? $i")
    println("Média das idades digitadas: $media")
    println("Quantas pessoas tem 21 anos ou mais: $maior21")
}
