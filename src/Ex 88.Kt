fun main() {
    Gerador("Aprendendo Portugol", 4)
}

fun Gerador(mensagem: String, repeticoes: Int) {
    println("+ ======= +")
    for (i in 1..repeticoes) {
        println(mensagem.chunked(7).joinToString("\n"))
    }
    println("+ ======= +")
}
