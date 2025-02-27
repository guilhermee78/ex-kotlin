fun main(){
    println("Qual seu nome :   ")
    val nome =  readln().toString()
    println("Qual seu sexo :   ")
    val sexo = readln().toString()
    println("Qual o valor da sua compra:  ")
    val valor = readln().toFloat()
    if(sexo == "Masculino"){
        val desconto = valor * 0.05
        val compra = valor - desconto
        println("O valor da compra ficou R$$compra")

    }else if (sexo == "Feminino"){
        val desconto2 = valor * 0.013
        val compra2 = valor - desconto2

    }else {
        println("Sexo inválido. Por favor, insira Masculino ou Feminino.")
    }


    }









