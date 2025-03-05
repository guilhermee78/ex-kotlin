//Reajuste de salário
fun main() {
    println("Digite o salário atual:")
    val salario = readln().toFloat()

    println("Digite o gênero (M para masculino, F para feminino):")
    val genero = readln().uppercase()

    println("Quantos anos de empresa?")
    val anos = readln().toInt()

    val percentualAumento = when { 
//avalia as condições de cima para baixo , e executa apenas a primeira que for verdadeira .
        genero == "F" && anos < 15 -> 0.05
        genero == "F" && anos <= 20 -> 0.12
        genero == "F" -> 0.23
        genero == "M" && anos < 20 -> 0.03
        genero == "M" && anos <= 30 -> 0.13
        else -> 0.25
    }

    val novoSalario = salario + (salario * percentualAumento)
    println("O novo salário é: R$%.2f".format(novoSalario))
}
