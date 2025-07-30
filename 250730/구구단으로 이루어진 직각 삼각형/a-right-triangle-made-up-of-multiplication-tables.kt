import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val output = (1..n).joinToString("\n") { i ->
        (1..n - i + 1).joinToString(" / ") { j ->
            "$i * $j = ${i * j}"
        }
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}