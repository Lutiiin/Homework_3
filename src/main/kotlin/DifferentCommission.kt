import kotlin.math.roundToInt

fun main() {
    val transferAmount = 67000
    val amountTransfersByMonth = 8000000
    val transfer = commissionCalculation(TypeCard.Mastercard, amountTransfersByMonth, transferAmount) + transferAmount
    println(transfer)
}

fun commissionCalculation(typeCard : TypeCard = TypeCard.VK_Pay,
                          amountTransfersByMonth : Int,
                          transferAmount : Int): Int {
    val comission = when (typeCard){
        TypeCard.Mastercard, TypeCard.Maestro -> {
            if(amountTransfersByMonth < 7500000) transferAmount else (transferAmount * 0.006 + 2000).roundToInt()
        }
        TypeCard.Visa, TypeCard.MIR -> {
            if(transferAmount * 0.0075 < 3500) 3500 else transferAmount * 0.0075.roundToInt()
        }
        TypeCard.VK_Pay -> {
            0
        }
    }
    return comission
}

enum class TypeCard {
    VK_Pay,
    Mastercard,
    Maestro,
    Visa,
    MIR
}