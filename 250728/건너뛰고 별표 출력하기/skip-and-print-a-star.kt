import java.io.BufferedReader
import java.io.BufferedWriter
import kotlin.math.abs

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val size = 2 * n - 1
    val output = Array(size) { i ->
        val starCount = n - abs(i + 1 - n)
        Array(starCount) { "*" }.joinToString("")
    }.joinToString("\n\n")
    BufferedWriter(System.out.writer()).use { it.write(output) }
}