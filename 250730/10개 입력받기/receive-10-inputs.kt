import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val output = BufferedReader(System.`in`.reader()).use { br ->
        val st = StringTokenizer(br.readLine())
        val numbers = generateSequence { st.nextToken().toInt() }
            .take(10)
            .takeWhile { it != 0 }
            .toList()
        listOf(numbers.sum(), "%.1f".format(numbers.average())).joinToString(" ")
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}