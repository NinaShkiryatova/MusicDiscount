const val minDiscountLevel: Int = 1001_00
const val minDiscount: Int = 100_00

const val increasedDiscountLevel: Int = 10_001_00
const val increasedDiscount: Double = 0.95

const val isAdditionalDiscount: Boolean = true
const val additionalDiscount: Double = 0.99

fun main() {
    var actualPurchase: Int = 100_00
    var previousPurchases: Int = 10_001_00

    var priceWithDiscount: Int = 0
    when {
        previousPurchases >= increasedDiscountLevel -> priceWithDiscount = (actualPurchase * increasedDiscount).toInt()
        previousPurchases >= minDiscountLevel -> priceWithDiscount = actualPurchase - minDiscount
    }

    val finalPrice: Int =
        if (!isAdditionalDiscount) priceWithDiscount else (priceWithDiscount * additionalDiscount).toInt()
    println("Сумма покупки с учетом скидок составит ${finalPrice / 100} рублей ${finalPrice % 100} копеек.")
}