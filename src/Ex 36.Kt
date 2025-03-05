fun main() {
    print("Digite a quantidade de horas de atividade física no mês: ")
    val horasAtividade = readLine()!!.toInt()
    
    var pontos = 0
    
    if (horasAtividade <= 10) {
        pontos = horasAtividade * 2
    } else if (horasAtividade <= 20) {
        pontos = (10 * 2) + ((horasAtividade - 10) * 5)
    } else {
        pontos = (10 * 2) + (10 * 5) + ((horasAtividade - 20) * 10)
    }
    
    val dinheiroGanho = pontos * 0.05
    
    println("Você ganhou $pontos pontos e faturou R$ %.2f".format(dinheiroGanho))
}