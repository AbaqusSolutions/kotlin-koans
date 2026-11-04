import kotlin.random.Random

data class Employee(val name: String, var salary: Int)

// Write your code here
class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int) {

    val employeeNames: List<String> = listOf("Warrior", "Gary", "Daye", "Sofia")

    fun generateEmployee(): Employee {

        val salary = Random.nextInt(from = minSalary, until = maxSalary)

        return Employee(employeeNames.random(), salary)
    }
}

fun main() {
    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generateEmployee())
}
