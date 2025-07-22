import java.io.BufferedWriter

fun main() {
    val range = (5..17)
    BufferedWriter(System.out.writer()).use {
        val output = range.joinToString(" ")
        it.write(output)
    }
}