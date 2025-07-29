import java.io.BufferedReader
import java.io.BufferedWriter
import kotlin.math.abs

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val output = (0..2 * (n - 1)).joinToString("\n") { i ->
        val abs = abs((n - 1) - i)
        val spaces = "  ".repeat(n - 1 - abs)
        val stars = "* ".repeat(2 * abs + 1)
        "$spaces$stars"
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}