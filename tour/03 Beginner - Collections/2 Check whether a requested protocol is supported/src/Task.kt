fun main() {
    val SUPPORTED = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = requested.uppercase() in SUPPORTED // Replace the TODO() function
    println("Support for $requested: $isSupported")
}
