import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        val st = StringTokenizer(br.readLine())
        val output = buildString {
            generateSequence { st.nextToken().toInt() }
                .takeWhile { it != -999 && it != 999 }
                .toList()
                .also {
                    append("${it.maxOrNull()} ${it.minOrNull()}")
                }
        }
        BufferedWriter(System.out.writer()).use { it.write(output) }
    }
}