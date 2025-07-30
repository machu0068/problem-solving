import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        val n = br.readLine().toInt()
        val output = buildString {
            repeat(n) {
                val st = StringTokenizer(br.readLine())
                val (a, b) = st.nextToken().toInt() to st.nextToken().toInt()
                appendLine(
                    (a..b).filter { it % 2 == 0 }.sum()
                )
            }
        }
        BufferedWriter(System.out.writer()).use { it.write(output) }
    }
}