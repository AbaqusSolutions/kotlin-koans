fun main() {
    // Write your code here
    for (number in 1..100) {
        var line = "";

        if (number % 3 == 0) {
            line += "fizz"
        };
        if (number % 5 == 0) {
            line += "buzz"
        };

        println(if (line == "") number else line)
    }
}
