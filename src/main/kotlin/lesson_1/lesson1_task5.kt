package lesson_1

fun main() {
    val totalSeconds = 6480
    val hour = totalSeconds / 3600
    val minutes = (totalSeconds % 3600) / 60
    val seconds = totalSeconds % 60

    println(String.format("Время в космосе: %#o:$minutes:%#o", hour, seconds))
}