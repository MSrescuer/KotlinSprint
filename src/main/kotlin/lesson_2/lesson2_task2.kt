package lesson_2

fun main() {
    val staff = 50
    val intern = 30
    val staffSalary = 30000
    val internSalary = 20000

    val staffExpenses = staff * staffSalary
    val generalExpenses = (staff * staffSalary) + (intern * internSalary)
    val averageSalary = generalExpenses / (staff + intern)

    println(String.format("Зарплата постоянных сотрудников: %,d", staffExpenses))
    println(String.format("Общие расходы по ЗП: %,d", generalExpenses))
    println(String.format("Средняя ЗП одного сотрудника: %,d", averageSalary))
}