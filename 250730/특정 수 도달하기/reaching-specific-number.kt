import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        val st = StringTokenizer(br.readLine())
        val output = Array(10) { st.nextToken().toInt() }
            .asSequence()
            .takeWhile { it < 250 }
            .let { listOf(it.sum(), it.average().toString().format("%.1f")) }
            .joinToString(" ")
        BufferedWriter(System.out.writer()).use { it.write(output) }
    }
}