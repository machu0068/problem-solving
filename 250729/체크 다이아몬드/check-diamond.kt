import java.io.BufferedReader
import java.io.BufferedWriter
import kotlin.math.abs

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val output = (0..2 * (n - 1)).joinToString("\n") { i ->
        val abs = abs((n - 1) - i)
        val space = " ".repeat(abs)
        val star = "* ".repeat(n - abs)
        "$space$star"
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}