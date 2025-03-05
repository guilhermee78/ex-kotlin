fun main() {
    var maiorPreco = 0.0
    var menorPreco = 0.0

    for (i in 1..8) {
        print("Digite o preço do $iº produto: ")
        val preco = readLine()!!.toDouble()

        if (i == 1) {
            maiorPreco = preco
            menorPreco = preco
        } else {
            if (preco > maiorPreco) {
                maiorPreco = preco
            }
            if (preco < menorPreco) {
                menorPreco = preco
            }
        }
    }

    println("O maior preço é: $maiorPreco")
    println("O menor preço é: $menorPreco")
}
