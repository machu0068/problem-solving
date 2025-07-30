import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val output = buildString {
        (1..n).forEach { i ->
            (1..n).forEach { j ->
                append("($i, $j)")
                append(if ((i + j) % 4 == 0) "\n" else " ")
            }
        }
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}