fun main() {
    val notas = DoubleArray(10)
    var somaNotas = 0.0
    var maiorNota = 0.0
    var posicoesMaiorNota = ""

    for (i in 0..9) {
        print("Digite a nota do aluno ${i + 1}: ")
        notas[i] = readLine()!!.toDouble()
        somaNotas += notas[i]

        if (notas[i] > maiorNota) {
            maiorNota = notas[i]
            posicoesMaiorNota = "$i"
        } else if (notas[i] == maiorNota) {
            posicoesMaiorNota += ", $i"
        }
    }

    val mediaTurma = somaNotas / 10

    var alunosAcimaMedia = 0
    for (i in 0..9) {
        if (notas[i] > mediaTurma) {
            alunosAcimaMedia++
        }
    }

    println("Média da turma: $mediaTurma")
    println("Número de alunos acima da média: $alunosAcimaMedia")
    println("Maior nota: $maiorNota")
    println("Posições da maior nota: $posicoesMaiorNota")
}
