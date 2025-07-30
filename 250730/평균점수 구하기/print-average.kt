import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val output = BufferedReader(System.`in`.reader()).use { br ->
        val st = StringTokenizer(br.readLine())
        val average = Array(8) { st.nextToken().toDouble() }.average()
        "%.1f".format(average)
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}