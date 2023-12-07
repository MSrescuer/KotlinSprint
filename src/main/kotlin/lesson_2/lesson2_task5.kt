package lesson_2

import kotlin.math.pow
const val PERCENT = 100

fun main() {
    val sum = 70_000
    val annual = 16.7


    val result = sum * (1 + annual / PERCENT).pow(20)

    println(String.format("Размер вклада через 20 лет: %.3f.", result))
}