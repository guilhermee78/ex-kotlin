//Escreva um programa que pergunte a velocidade de um carro.
//Caso ultrapasse 80Km/h, exiba uma mensagem dizendo que o usuário
//foi multado. Nesse caso, exiba o valor da multa, cobrando R$5 por
//cada Km acima da velocidade permitida.

fun main(){
    print("Qual foi a velocidade do carro?  ")
    var velocidade = readln().toInt()
    var limite = 80
    var valorMulta = 5
    if(velocidade > limite){
        valorMulta = valorMulta * velocidade
        print("Você foi multado, o valor da multa foi $valorMulta")
    }


}