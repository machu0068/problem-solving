import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val (n, m) = BufferedReader(System.`in`.reader()).use { br ->
        StringTokenizer(br.readLine()).run { nextToken().toInt() to nextToken().toInt() }
    }
    val iterator = generateSequence(1) { it + 1 }.iterator()
    val array = Array(n) { Array(m) { 0 } }.apply {
        (0..n + m).forEach { sum ->
            val startRow = if (sum < m) 0 else sum - m + 1
            val endRow = minOf(sum, n - 1)
            (startRow..endRow).forEach { row ->
                this[row][sum - row] = iterator.next()
            }
        }
    }
    val output = array.joinToString("\n") { it.joinToString(" ") }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}