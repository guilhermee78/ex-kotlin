//66- Escreva um programa que leia um número qualquer e mostre a tabuada desse número, usando a estrutura “para”.
//Ex: Digite um valor: 5
//5x1=5
//5 x 2 = 10...

fun main(){
    var i = 0
    println("A tabuada de qual número você deseja saber?")
    var numero = readln().toInt()
    while(i <= 10) {
        var mult = numero * i
        i++
        println("$numero X $i = $mult ")

    }
}

