//Escreva um programa que pergunte a velocidade de um carro.
//Caso ultrapasse 80Km/h, exiba uma mensagem dizendo que o usuário
//foi multado. Nesse caso, exiba o valor da multa, cobrando R$5 por
//cada Km acima da velocidade permitida.

fun main(){
    print("Qual foi a velocidade do carro?  ")
    val velocidade = readln().toInt()
    val limite = 80
    val valorMulta = 5
    if(velocidade > limite){
        val excesso = velocidade - limite
        val Multa = valorMulta * excesso
        print("Você foi multado, o valor da multa foi $Multa")
    }
}