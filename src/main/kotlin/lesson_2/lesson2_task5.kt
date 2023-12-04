package lesson_2

import kotlin.math.pow

fun main() {
    val sum = 70_000
    val percent = 16.7

    val result = sum * (1 + percent / 100).pow(20)

    println(String.format("Размер вклада через 20 лет: %.3f.", result))
}