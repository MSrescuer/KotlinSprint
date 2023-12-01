package lesson_2

fun main() {
    val timeHour = 9
    val timeMinute = 39
    val travelTime = 457
    val minutesInHour = 60

    val totalTimeMinute = timeHour * minutesInHour + timeMinute
    val arrivalTime = (travelTime + totalTimeMinute) / minutesInHour
    val arrivalTime1 = (travelTime + totalTimeMinute) % minutesInHour

    println("Время прибытия: $arrivalTime:$arrivalTime1")


}