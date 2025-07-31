import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        val st = StringTokenizer(br.readLine())
        val map = generateSequence { st.nextToken().toInt() }
            .takeWhile { it != 0 }
            .groupingBy { it / 10 }
            .eachCount()
        val output = (10 downTo 1).joinToString("\n") {
            "${it * 10} - ${map[it] ?: 0}"
        }
        BufferedWriter(System.out.writer()).use { it.write(output) }
    }
}