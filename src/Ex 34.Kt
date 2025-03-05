fun main() {
    print("Digite seu peso (kg): ")
    val peso = readLine()!!.toDouble()
    
    print("Digite sua altura (m): ")
    val altura = readLine()!!.toDouble()
    
    val imc = peso / (altura * altura)
    
    var classificacao = ""
    
    if (imc < 18.5) {
        classificacao = "Abaixo do peso"
    } else if (imc < 25) {
        classificacao = "Peso ideal"
    } else if (imc < 30) {
        classificacao = "Sobrepeso"
    } else if (imc < 40) {
        classificacao = "Obesidade"
    } else {
        classificacao = "Obesidade mórbida"
    }
    
    println("Seu IMC é %.2f e sua classificação é: %s".format(imc, classificacao))
}
