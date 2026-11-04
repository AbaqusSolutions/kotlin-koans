// Replace the empty map. Keep the variable name as number2word.
val number2word: Map<Int, String> = mapOf(1 to "one", 2 to "two", 3 to "three")

fun main() {
    val n = 2
    println("$n is spelled as '${number2word[n]}'")
}
