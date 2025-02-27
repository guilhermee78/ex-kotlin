fun main(){
    println("Digite um número inteiro:  ")
    val num1 = readln().toInt()
    println("Digite outro número inteiro: ")
    val num2 = readln().toInt()
    if(num1 > num2){
        println("O primeiro valor é maior")
    }else if ( num2 > num1){
        println("O segundo valor é o maior")
    }else{
        println("Não existe valor maior,os dois são iguais !")
    }

}
