import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val output = (n downTo 1).joinToString("\n") { i ->
        val spaces = (1..n - i).joinToString("") { "  " }
        val numbers = (i downTo 1).joinToString(" ")
        spaces + numbers
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}