fun main() {
    println("Qual a distância você deseja percorrer em (Km): ")
    val distancia = readln().toFloat() // Usar Float para cálculos com decimais
    
    if (distancia <= 200) {
        val preco = distancia * 0.50
        println("O preço da passagem será: R$ $preco")
    } else {
        val preco1 = distancia * 0.45
        println("O preço da passagem será: R$ $preco1")
    }
}
