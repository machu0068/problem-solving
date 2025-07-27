import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    var (a, n) = BufferedReader(System.`in`.reader()).use { br ->
        val st = StringTokenizer(br.readLine())
        Pair(st.nextToken().toInt(), st.nextToken().toInt())
    }
    val output = buildString {
        repeat(n) {
            a = a + n
            appendLine(a)
        }
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}