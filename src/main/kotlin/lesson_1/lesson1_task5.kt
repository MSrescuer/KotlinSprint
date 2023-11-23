package lesson_1

fun main() {
    val seconds = 6480
    val hour = seconds/3600
    val surplusMinute = (seconds-hour*3600)/60
    val surplusSeconds = seconds-hour*3600-surplusMinute*60

    println("Время в космсе: 0$hour:$surplusMinute:0$surplusSeconds")
}