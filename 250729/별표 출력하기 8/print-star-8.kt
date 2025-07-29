import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val output = (0..n - 1).joinToString("\n") { i ->
        val starCount = when {
            i % 2 == 0 -> 1
            else -> i + 1
        }
        val stars = "* ".repeat(starCount)
        stars
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}