import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val output = (1..n).joinToString(" ") {
        when {
            it % 2 == 0 || it % 3 == 0 -> "1"
            else -> "0"
        }
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}