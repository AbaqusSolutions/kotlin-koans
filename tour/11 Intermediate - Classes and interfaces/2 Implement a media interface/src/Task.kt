interface Media {
    val title: String

    fun play()
}// Write your code here

class Audio(override val title: String, val composer: String) : Media {

    override fun play() {
        println("Playing audio: $title, composed by $composer")
    }

}// Write your code here

fun main() {
    val audio = Audio("Symphony No. 5", "Beethoven")
    audio.play()
    // Playing audio: Symphony No. 5, composed by Beethoven
}
