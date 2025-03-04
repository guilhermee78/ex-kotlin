fun main() {
    println("Bem-vindo ao simulador de empréstimo bancário!")

    print("Digite o valor da casa: R$ ")
    val valorCasa = readLine()!!.toDouble()

    print("Digite o salário do comprador: R$ ")
    val salario = readLine()!!.toDouble()

    print("Digite em quantos anos o comprador vai pagar: ")
    val anos = readLine()!!.toInt()

    val meses = anos * 12
    val prestacaoMensal = valorCasa / meses
    val limitePrestacao = salario * 0.30

    println("\nValor da prestação mensal: R$ ${"%.2f".format(prestacaoMensal)}")
    println("Limite máximo da prestação (30% do salário): R$ ${"%.2f".format(limitePrestacao)}")

    if (prestacaoMensal > limitePrestacao) {
        println("\nEmpréstimo negado! A prestação mensal excede 30% do salário.")
    } else {
        println("\nEmpréstimo aprovado! A prestação está dentro do limite.")
    }
}
