import kotlin.math.roundToInt

fun main(){
    val amount: Int = 15000
    val discountPercentage: Double = 0.05
    val dearCustomer: Boolean = true
    val discountPercentageDear: Double = 0.01

    var result: Int = amount

    if (amount > 10_000) {
        result = (amount * (1 - discountPercentage)).roundToInt() 
    } else if (amount > 1_000) {
        result = amount.minus(100)
    }
    if (dearCustomer) {
        result = (result * (1 - discountPercentageDear)).roundToInt()
    }
    println("Итоговая стоимость покупки: $result")
}