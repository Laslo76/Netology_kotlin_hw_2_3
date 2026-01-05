import kotlin.math.roundToInt

fun main(){
    val amount: Int = 15000
    val discountPercentage: Double = 0.05
    val dearCustomer: Boolean = true
    val discountPercentageDear: Double = 0.01

    var preliminaryDiscount = 0.0
    if (amount > 10_000) {
        preliminaryDiscount = amount * discountPercentage
    } else if (amount > 1_000) {
        preliminaryDiscount = 100.0
    }
    val preliminaryResult = (amount - preliminaryDiscount).roundToInt()

    val dearDiscount = if (dearCustomer) preliminaryResult * discountPercentageDear else 0.0
    val result = (preliminaryResult - dearDiscount).roundToInt()

    println("Итоговая стоимость покупки: $result")
}