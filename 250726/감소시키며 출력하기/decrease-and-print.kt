import java.io.BufferedWriter

fun main() {
    val output = (17 downTo 5).joinToString(" ")
    BufferedWriter(System.out.writer()).use { it.write(output) }
}