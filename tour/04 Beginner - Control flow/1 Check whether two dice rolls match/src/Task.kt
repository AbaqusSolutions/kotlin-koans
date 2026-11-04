import kotlin.random.Random

fun main() {
    val firstResult = Random.nextInt(6)
    val secondResult = Random.nextInt(6)
    // Write your code here

    val match = firstResult == secondResult

    if (match) {
        println("You win :)")
    } else {
        println("You lose :(")
    }
}
