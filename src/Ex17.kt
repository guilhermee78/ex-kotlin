fun main(){
    print("Quantos cigarros você fuma por dia? ")
    val cgr = readln().toInt()
    print("Há quantos anos você fuma? ")
    val ano = readln().toInt()
    val total = cgr * ano * 365 //total de cigarros fumados nos anos
    val min = total * 10 // 10 min por cigarro
    val dias = min / (24 * 60) // minutos conv em dia = minutos totais / 1440
    println("Dias perdidos pelo fumante: $dias")


}