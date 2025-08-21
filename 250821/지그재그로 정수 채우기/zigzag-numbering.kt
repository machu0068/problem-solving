import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val (n, m) = BufferedReader(System.`in`.reader()).use { br ->
        StringTokenizer(br.readLine()).run { nextToken().toInt() to nextToken().toInt() }
    }
    val iterator = generateSequence(0) { it + 1 }.iterator()
    val array = Array(n) { Array(m) { 0 } }.apply {
        (0 until m).forEach { col ->
            val range = when (col % 2 == 0) {
                true -> (0 until n)
                false -> (0 until n).reversed()
            }
            range.forEach { row ->
                this[row][col] = iterator.next()
            }
        }
    }
    val output = array.joinToString("\n") { it.joinToString(" ") }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}