import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val output = buildString {
        repeat(n) { i ->
            repeat(i) {
                append("  ")
            }
            repeat(2 * (n - i) - 1) {
                append("* ")
            }
            appendLine()
        }
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}