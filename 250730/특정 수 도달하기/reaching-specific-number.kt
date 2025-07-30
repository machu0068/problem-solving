import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        val st = StringTokenizer(br.readLine())
        val output = Array(10) { st.nextToken().toInt() }
            .asSequence()
            .takeWhile { it < 250 }
            .let { listOf(it.sum().toString(), "%.1f".format(it.average())) }
            .joinToString(" ")
        BufferedWriter(System.out.writer()).use { it.write(output) }
    }
}