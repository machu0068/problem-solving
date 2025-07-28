import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val (a, b) = BufferedReader(System.`in`.reader()).use { br ->
        val st = StringTokenizer(br.readLine())
        Pair(st.nextToken().toInt(), st.nextToken().toInt())
    }
    val output = when (a >= 0) {
        true -> buildString { repeat(b) { append(a.toString()) } }
        false -> "0"
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}