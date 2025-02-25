//Faça um programa que leia o ano de nascimento de uma pessoa,
//calcule a idade dela e depois mostre se ela pode ou não votar.
fun main(){
    val anoAtual = 2025
    println("Qual ano você nasceu?  ")
    val anoNascimento = readln().toInt()
    val conta =  anoAtual - anoNascimento
    if(conta >= 16){
        println("Você pode votar")
    }else{
        println("Você não está apto para votar")
    }

}
