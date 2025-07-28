import java.io.BufferedReader
import java.io.BufferedWriter
import kotlin.math.abs

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val size = 2 * n - 1
    val output = Array(size) { i ->
        val starCount = abs(i - (n - 1)) + 1
        Array(starCount) { "*" }.joinToString(" ")
    }.joinToString("\n")
    BufferedWriter(System.out.writer()).use { it.write(output) }
}