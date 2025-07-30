import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val iterator = generateSequence('A') { if (it == 'Z') 'A' else it + 1 }.iterator()
    val output = (1..n).joinToString("\n") { i ->
        val spaces = "  ".repeat(i - 1)
        val chars = (n - i + 1 downTo 1).joinToString(" ") { iterator.next().toString() }
        spaces + chars
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}