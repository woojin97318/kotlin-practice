package `6_Classes`

import kotlin.random.Random

data class Employee(
    val name: String,
    var salary: Int
)

class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int) {
    val names = listOf("John", "Mary", "Ann", "Paul", "Jack", "Elizabeth")
    fun generateEmployee() =
        Employee(
            names.random(),
            Random.nextInt(from = minSalary, until = maxSalary)
        )
}

fun main() {
    /**
     * 연습문제 1
     */
    val emp = Employee("Mary", 20)
    println(emp)
    emp.salary += 10
    println(emp)

    println()

    /**
     * 연습문제 2
     */
    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generateEmployee())
}