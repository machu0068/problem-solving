import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val size = 2 * n - 1
    val output = Array(size) { i ->
        Array(
            when {
                i < n -> i + 1
                else -> size - i
            }
        ) { "*" }.joinToString(" ")
    }.joinToString("\n")
    BufferedWriter(System.out.writer()).use { it.write(output) }
}