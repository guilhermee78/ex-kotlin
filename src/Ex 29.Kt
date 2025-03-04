fun main() {
    print("Nome: ")
    val nome = readLine() ?: ""

    print("Salário: ")
    val salario = readLine()!!.toDouble()

    print("Anos na empresa: ")
    val anos = readLine()!!.toInt()

    val aumento = if (anos < 3) 0.03 else if (anos < 10) 0.125 else 0.20
    val novoSalario = salario * (1 + aumento)

    println("Novo salário de $nome: R$ %.2f".format(novoSalario))
}
