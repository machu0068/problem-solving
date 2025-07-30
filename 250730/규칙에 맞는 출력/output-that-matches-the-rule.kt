import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val output = (0 until n).joinToString("\n") { i ->
        (n - i..n).joinToString(" ")
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}