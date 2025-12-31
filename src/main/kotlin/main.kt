fun main(){
    var amaunt: Int = 1000
    val discountPercentage: Double = 0.05
    var dearCustomer: Boolean = false
    val discountPercentageDear: Double = 0.01

    if (amaunt > 1_000 && amaunt <= 10_000) {
       amaunt -= 100
    } else if (amaunt > 10_000) {
        amaunt = (amaunt * (1 - discountPercentage)).toInt()
    }
    if (dearCustomer) {
        amaunt = (Math.round(amaunt * (1 - discountPercentageDear))).toInt()
    }
    println("Итоговая стоимость покупки: $amaunt")
}