import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val output = BufferedReader(System.`in`.reader()).use { br ->
        val st = StringTokenizer(br.readLine())
        Array(10) { st.nextToken().toInt() }.sum().toString()
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}