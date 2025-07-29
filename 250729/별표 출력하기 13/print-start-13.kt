import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val output = (1..2 * n).joinToString("\n") { i ->
        val starCount = when {
            i % 2 == 0 -> i / 2
            else -> n - (i - 1) / 2
        }
        val stars = "* ".repeat(starCount)
        stars
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}