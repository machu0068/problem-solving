import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        val st = StringTokenizer(br.readLine())
        val range = (st.nextToken().toInt()..st.nextToken().toInt())
        val c = st.nextToken().toInt()
        val output = when (range.firstOrNull { it % c == 0 } == null) {
            true -> "YES"
            false -> "NO"
        }
        BufferedWriter(System.out.writer()).use { it.write(output) }
    }
}