import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        val st = StringTokenizer(br.readLine())
        val output = generateSequence { st.nextToken().toInt() }
            .take(10)
            .takeWhile { it != 0 }
            .toList()
            .reversed()
            .joinToString(" ")
        BufferedWriter(System.out.writer()).use { it.write(output) }
    }
}