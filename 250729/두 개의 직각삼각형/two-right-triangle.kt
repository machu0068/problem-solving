import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val output = (0 until n).joinToString("\n") { i ->
        val stars = "*".repeat(n - i)
        val spaces = " ".repeat(i * 2)
        "$stars$spaces$stars"
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}