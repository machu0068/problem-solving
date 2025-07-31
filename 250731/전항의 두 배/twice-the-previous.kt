import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        val st = StringTokenizer(br.readLine())
        val (first, second) = st.nextToken().toInt() to st.nextToken().toInt()
        val output = generateSequence(first to second) { it.second to it.second + 2 * it.first }
            .map { it.first }
            .take(10)
            .joinToString(" ")
        BufferedWriter(System.out.writer()).use { it.write(output) }
    }
}