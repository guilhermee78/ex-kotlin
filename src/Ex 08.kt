fun main(){
    print("Digite uma distância em metros: ")
    var metroscm = readln().toInt()
    print("Digite outra distância em metros: ")
    var metroskm = readln().toInt()
    var distanciacm = metroscm * 100
    println("Distância de $distanciacm Cm")
    var distanciakm = metroskm / 1000
    print("Distância de $distanciakm Km")

}