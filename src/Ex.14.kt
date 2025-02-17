fun main(){
    print("Quantos Km foram rodados com o carro? ")
    var km = readln().toInt()
    print("Foi utilizado por quantos dia? ")
    var dias = readln().toInt()
    val diaUsado = dias * 90
    val kmRodado = km * 0.20
    var total = diaUsado + kmRodado
    print("O total a pagar é $total")


}