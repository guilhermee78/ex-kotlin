fun main() {
    var totalAlunos = 0
    var somaIdades = 0
    var idade: Int

    println("Digite as idades dos alunos (999 para parar):")

    while (true) {
        print("Idade: ")
        idade = readLine()!!.toInt()

        if (idade == 999) {
            break
        }

        totalAlunos++
        somaIdades += idade
    }

    if (totalAlunos > 0) {
        val mediaIdade = somaIdades.toDouble() / totalAlunos
        println("Total de alunos na turma: $totalAlunos")
        println("Média de idade da turma: %.2f".format(mediaIdade))
    } else {
        println("Nenhum aluno foi cadastrado.")
    }
}
