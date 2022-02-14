import org.junit.Assert
import org.junit.Test

internal class JustKtTest {

    @Test
    fun agoToText1() {
        val time = agoToText(59)
        Assert.assertEquals("был(а) в сети только что", time)
    }

    @Test
    fun agoToText2() {
        val time = agoToText(100)
        Assert.assertEquals("был(а) в сети 1 минуту назад", time)
    }

    @Test
    fun agoToText3() {
        val time = agoToText(120)
        Assert.assertEquals("был(а) в сети 2 минуты назад", time)
    }

    @Test
    fun agoToText4() {
        val time = agoToText(300)
        Assert.assertEquals("был(а) в сети 5 минут назад", time)
    }

    @Test
    fun agoToText5() {
        val time = agoToText(3700)
        Assert.assertEquals("был(а) в сети 1 час назад", time)
    }

    @Test
    fun agoToText6() {
        val time = agoToText(7200)
        Assert.assertEquals("был(а) в сети 2 часа назад", time)
    }

    @Test
    fun agoToText7() {
        val time = agoToText(18000)
        Assert.assertEquals("был(а) в сети 5 часов назад", time)
    }

    @Test
    fun agoToText8() {
        val time = agoToText(90000)
        Assert.assertEquals("был(а) в сети сегодня", time)
    }

    @Test
    fun agoToText9() {
        val time = agoToText(180000)
        Assert.assertEquals("был(а) в сети вчера", time)
    }

    @Test
    fun agoToText10() {
        val time = agoToText(360000)
        Assert.assertEquals("был(а) в сети давно", time)
    }
}