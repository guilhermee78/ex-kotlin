//40- Crie um programa que mostre na tela a seguinte contagem: 0 3 6 9 12 15 18 Acabou!

fun main() {
    var i = 0
    while (i <= 18) {
        print("$i ")
        i += 3
    }
    println("Acabou!")
}
