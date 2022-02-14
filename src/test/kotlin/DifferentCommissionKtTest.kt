import org.junit.Assert
import org.junit.Test

internal class DifferentCommissionKtTest {

    @Test
    fun commissionCalculation() {
        val transferAmount = 67000
        val amountTransfersByMonth = 8000000
        val transfer = commissionCalculation(transferAmount, amountTransfersByMonth) + transferAmount
        Assert.assertEquals(transferAmount, transfer)
    }

    @Test
    fun commissionCalculationVKPay() {
        val transferAmount = 67000
        val amountTransfersByMonth = 8000000
        val transfer = commissionCalculation(amountTransfersByMonth, transferAmount, TypeCard.VK_Pay,) + transferAmount
        Assert.assertEquals(transferAmount, transfer)
    }

    @Test
    fun commissionCalculationMasterCard() {
        val transferAmount = 10000
        val amountTransfersByMonth = 7000000
        val transfer = commissionCalculation(amountTransfersByMonth, transferAmount, TypeCard.Mastercard,) + transferAmount
        Assert.assertEquals(20000, transfer)
    }

    @Test
    fun commissionCalculationMaestro() {
        val transferAmount = 10000
        val amountTransfersByMonth = 8000000
        val transfer = commissionCalculation(amountTransfersByMonth, transferAmount, TypeCard.Maestro) + transferAmount
        Assert.assertEquals(12060, transfer)
    }

    @Test
    fun commissionCalculationVisa() {
        val transferAmount = 10000
        val amountTransfersByMonth = 8000000
        val transfer = commissionCalculation( amountTransfersByMonth, transferAmount, TypeCard.Visa,) + transferAmount
        Assert.assertEquals(13500, transfer)
    }

    @Test
    fun commissionCalculationMir() {
        val transferAmount = 3000000
        val amountTransfersByMonth = 8000000
        val transfer = commissionCalculation(amountTransfersByMonth, transferAmount, TypeCard.MIR) + transferAmount
        Assert.assertEquals(3022500, transfer)
    }
}