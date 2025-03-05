fun main() {
    var totalSalariosHomens = 0.0
    var totalSalariosMulheres = 0.0
    var continuar = "S"

    println("Cadastro de funcionários")

    while (continuar == "S") {
        print("Digite o salário do funcionário: ")
        val salario = readLine()!!.toDouble()

        print("Digite o sexo do funcionário (M/F): ")
        val sexo = readLine()!!.uppercase()

        if (sexo == "M") {
            totalSalariosHomens += salario
        } else if (sexo == "F") {
            totalSalariosMulheres += salario
        } else {
            println("Sexo inválido! Tente novamente.")
            continue
        }

        print("Deseja continuar? (S/N): ")
        continuar = readLine()!!.uppercase()
    }

    println("Total pago aos homens: R$ %.2f".format(totalSalariosHomens))
    println("Total pago às mulheres: R$ %.2f".format(totalSalariosMulheres))
}
