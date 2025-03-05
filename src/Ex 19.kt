//Crie um algoritmo que leia o nome e as duas notas de um aluno,
//calcule a sua média e mostre na tela. No final, analise a média e
//mostre se o aluno teve ou não um bom aproveitamento (se ficou acima
//da média 7.0).

fun main() {
    println("Qual seu nome? ")
    val nome = readln().toString()
    println("Digite quanto você tirou na AP1 :  ")
    val nota1 = readln().toFloat()
    println("Quanto você tirou na AP2 : ")
    val nota2 = readln().toFloat()
    val media = (nota1 + nota2) / 2
    if(media >= 7.0) {

        println("O $nome teve um bom aproveitamento, com média de: $media")
    } else {
        println("O $nome NÃO teve um bom aproveitamento, com média de: $media")
    }

}






