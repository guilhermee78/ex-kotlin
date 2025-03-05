fun main() {
    var totalAltura = 0.0
    var pessoasMais90Kg = 0
    var pessoasMenos50KgMenos160m = 0
    var pessoasMais190mMais100Kg = 0

    for (i in 1..7) {
        println("Digite o peso da ${i}ª pessoa (kg):")
        val peso = readLine()!!.toDouble()

        println("Digite a altura da ${i}ª pessoa (m):")
        val altura = readLine()!!.toDouble()

        totalAltura += altura

        if (peso > 90) {
            pessoasMais90Kg++
        }

        if (peso < 50 && altura < 1.60) {
            pessoasMenos50KgMenos160m++
        }

        if (altura > 1.90 && peso > 100) {
            pessoasMais190mMais100Kg++
        }
    }

    val mediaAltura = totalAltura / 7

    println("Média de altura do grupo: $mediaAltura")
    println("Quantas pessoas pesam mais de 90kg: $pessoasMais90Kg")
    println("Quantas pessoas que pesam menos de 50kg e tem menos de 1.60m: $pessoasMenos50KgMenos160m")
    println("Quantas pessoas que medem mais de 1.90m e pesam mais de 100kg: $pessoasMais190mMais100Kg")
}
