fun main() {
    val sorteados = mutableListOf<Int>()
    var acimaDeCinco = 0
    var divisiveisPorTres = 0

    for (i in 1..20) {
        val numero = (0..10).random()
        sorteados.add(numero)

        if (numero > 5) {
            acimaDeCinco++
        }

        if (numero % 3 == 0) {
            divisiveisPorTres++
        }
    }

    println("Números sorteados: $sorteados")
    println("Quantidade de números acima de 5: $acimaDeCinco")
    println("Quantidade de números divisíveis por 3: $divisiveisPorTres")
}
