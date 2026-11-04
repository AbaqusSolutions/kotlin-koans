fun repeatN(n: Int, action: () -> Unit) {
    for (i in 1..n) {
        action()
    }
}

fun main() {
    // Write your code here
    repeatN(5) { println("Hello") }
}
