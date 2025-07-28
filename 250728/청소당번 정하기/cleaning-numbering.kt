import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val n = BufferedReader(System.`in`.reader()).use { it.readLine().toInt() }
    val counts = IntArray(3)
    (1..n).forEach { num ->
        when {
            num % 12 == 0 -> counts[2]++
            num % 3 == 0 -> counts[1]++
            num % 2 == 0 -> counts[0]++
        }
    }
    BufferedWriter(System.out.writer()).use { it.write(counts.joinToString(" ")) }
}