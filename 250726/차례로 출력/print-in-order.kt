import java.io.BufferedWriter

fun main() {
    val output = (5..17).joinToString(" ")
    BufferedWriter(System.out.writer()).use { it.write(output) }
}