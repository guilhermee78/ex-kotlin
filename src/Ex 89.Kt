fun main() {
    Gerador("Portugol Studio", 3, 2)
}

fun Gerador(mensagem: String, repeticoes: Int, borda: Int) {
    val bordas = arrayOf(
        "+-------=======------+",
        "~~~~~~~~:::::::~~~~~~~",
        "<<<<<<------->>>>>>>>>"
    )
    
    println(bordas[borda - 1])
    for (i in 1..repeticoes) {
        println(mensagem.chunked(7).joinToString("\n"))
    }
    println(bordas[borda - 1])
}
