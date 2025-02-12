fun main(){
    print("Qual a altura da parede: ")
    var altura = readln().toInt()
    print("Qual a largura da parede: ")
    var largura = readln().toInt()
    var calc = altura * largura
    var area = calc * calc
    print("A área da parede é $area")

}