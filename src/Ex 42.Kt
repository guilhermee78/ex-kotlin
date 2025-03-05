//42- Faça um algoritmo que pergunte ao usuário um número inteiro e positivo qualquer
//e mostre uma contagem até esse valor:
//Ex: Digite um valor: 35

fun main(){
    println("Digite um número inteiro positivo:")
    val num = readln().toInt()
    for(i in 0..num){
        print("$i ")

    }
}