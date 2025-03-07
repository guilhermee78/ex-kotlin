fun main() {
    val n = 10
    var primeiro = 1
    var segundo = 1

    println("Sequência de Fibonacci:")
    print("$primeiro $segundo ")

    for (i in 3..n) {
        val proximo = primeiro + segundo
        print("$proximo ")
        primeiro = segundo
        segundo = proximo
    }
}
