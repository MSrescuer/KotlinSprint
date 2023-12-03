package lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buff = 0.2

    val buffMaterial = (crystalOre * buff).toInt()
    val buffMaterial1 = (ironOre * buff).toInt()

    println("Бонусные кристаллы: $buffMaterial")
    println("Бонусное железо: $buffMaterial1")
}