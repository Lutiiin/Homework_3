import java.time.LocalDateTime

fun main() {
    val time = agoToText(18000)
    println(time)
}

fun agoToText(ago : Int): String {
    val hour = 60 * 60
    val day = 24 * hour
    var text = "был(а) в сети давно"
    val timeAgo = if (ago <= hour) ago/60 else ago/3600
    val minText = minToText(ago)
    val hourText = hourToText(ago)
    when (ago){
        in 0..60 -> text = "был(а) в сети только что"
        in 61..hour -> text = "был(а) в сети $timeAgo $minText назад"
        in (hour + 1)..day -> text = "был(а) в сети $timeAgo $hourText назад"
        in (day + 1)..day*2 -> text = "был(а) в сети сегодня"
        in (day*2 + 1)..day*3 -> text = "был(а) в сети вчера"
        else -> {text}
    }
    return text
}

fun minToText(sec: Int): String {
    val min = sec / 60
    return if (min % 10 == 1 && min % 11 != 0) "минуту" else if (min % 10 in 2..4) "минуты" else "минут"
}

fun hourToText(sec : Int) :String {
    val hour = sec/3600
    return if (hour % 10 == 1 && hour % 11 != 0) "час" else if (hour % 10 in 2..4) "часа" else "часов"
}
