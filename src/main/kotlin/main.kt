import kotlin.math.roundToInt

fun main(){
    val amount: Int = 15000
    val discountPercentage: Double = 0.05
    val dearCustomer: Boolean = true
    val discountPercentageDear: Double = 0.01

    val preliminaryDiscount = when {
        (amount > 10_000) ->  amount * discountPercentage
        (amount > 1_000) -> 100.0
        else -> 0.0
    }
    val preliminaryResult = amount - preliminaryDiscount
    val dearDiscount = if (dearCustomer) preliminaryResult * discountPercentageDear else 0.0
    val result = (preliminaryResult - dearDiscount).roundToInt()

    println("Итоговая стоимость покупки: $result руб.")
}