//63- Crie um programa usando a estrutura “faça enquanto” que leia vários números.
//A cada laço, pergunte se o usuário quer continuar ou não. No final, mostre na tela:
//• O somatório entre todos os valores
//• Qual foi o menor valor digitado
//• A média entre todos os valores
//• Quantos valores são pares

fun main(){
    var continuar = "sim"
    var somatorio = 0
    var media = 0
    var pares = 0
    var i = 0
    var minimo = Int.MAX_VALUE
    while (continuar == "sim"){
        println("Digite um número: ")
        var numeros = readln().toInt()
        minimo = minOf(minimo, numeros)
        somatorio += numeros
        i++
        if(numeros % 2 == 0){
            pares++
        }
        println("Deseja continuar? (sim/não)")
        continuar= readln()

    }

    media = somatorio / i

    println("Somatório de todos os números inseridos: $somatorio")
    println("Média de todos os números inseridos: $media")
    println("Menor número digitado: $minimo")
    println("Quantidade de números pares digitados: $pares")

}

