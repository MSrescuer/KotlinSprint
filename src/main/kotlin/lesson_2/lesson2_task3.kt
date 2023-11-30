package lesson_2

fun main() {
    val timeHour = 9
    val timeMinute = 39
    val travelTime = 457

    val totalTimeMinute = timeHour * 60 + timeMinute
    val arrivalTime = (travelTime + totalTimeMinute) / 60
    val arrivalTime1 = (travelTime + totalTimeMinute) % 60

    println("Время прибытия: $arrivalTime:$arrivalTime1")


}