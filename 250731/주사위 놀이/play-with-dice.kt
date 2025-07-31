import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        val st = StringTokenizer(br.readLine())
        val map = Array(10) { st.nextToken().toInt() }
            .groupingBy { it }
            .eachCount()
        val output = buildString {
            (1..6).forEach {
                appendLine("$it - ${map[it] ?: 0}")
            }
        }
        BufferedWriter(System.out.writer()).use { it.write(output) }
    }
}