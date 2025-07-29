import java.io.BufferedReader
import java.io.BufferedWriter
import kotlin.math.abs

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val output = (0..2 * (n - 1)).joinToString("\n") { i ->
        val abs = abs(i - (n - 1))
        val space = "  ".repeat(if (0 < n - 1 - i) n - 1 - i else 0)
        val at = "@ ".repeat(n - abs)
        "$space$at"
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}