import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val output = BufferedReader(System.`in`.reader()).use { br ->
        val st = StringTokenizer(br.readLine())
        val result = generateSequence { st.nextToken().toInt() }
            .take(10)
            .takeWhile { it != 0 }
            .filter { it % 2 == 0 }
            .toList()
        listOf(result.size, result.sum()).joinToString(" ")
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}