fun main() {
    print("Digite o tipo de carro (popular ou luxo): ")
    val tipoCarro = readLine()!!
    
    if (tipoCarro != "popular" && tipoCarro != "luxo") {
        println("Tipo de carro inválido!")
        return
    }
    
    print("Digite o número de dias alugados: ")
    val dias = readLine()!!.toInt()
    
    print("Digite a quantidade de Km percorridos: ")
    val kmPercorridos = readLine()!!.toDouble()
    
    var precoTotal = 0.0
    
    if (tipoCarro == "popular") {
        precoTotal = dias * 90.0
        if (kmPercorridos <= 100) {
            precoTotal += kmPercorridos * 0.20
        } else {
            precoTotal += kmPercorridos * 0.10
        }
    } else {
        precoTotal = dias * 150.0
        if (kmPercorridos <= 200) {
            precoTotal += kmPercorridos * 0.30
        } else {
            precoTotal += kmPercorridos * 0.25
        }
    }
    
    println("O preço total a pagar é: R$ %.2f".format(precoTotal))
}
