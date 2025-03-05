fun main() {
    print("Digite o salário atual: ")
    val salarioAtual = readLine()!!.toDouble()

    print("Digite o gênero do funcionário (M para masculino, F para feminino): ")
    val genero = readLine()!!.toUpperCase()

    print("Digite quantos anos o funcionário trabalha na empresa: ")
    val anosTrabalhados = readLine()!!.toInt()

    var aumento = 0.0

    if (genero == "F") {
        if (anosTrabalhados < 15) {
            aumento = 0.05
        } else if (anosTrabalhados in 15..20) {
            aumento = 0.12
        } else {
            aumento = 0.23
        }
    } else if (genero == "M") {
        if (anosTrabalhados < 20) {
            aumento = 0.03
        } else if (anosTrabalhados in 20..30) {
            aumento = 0.13
        } else {
            aumento = 0.25
        }
    } else {
        println("Gênero inválido!")
        return
    }

    val novoSalario = salarioAtual * (1 + aumento)

    println("Novo salário: R$ ${"%.2f".format(novoSalario)}")
}
