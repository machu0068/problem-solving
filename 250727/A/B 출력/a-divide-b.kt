import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    var (a, b) = BufferedReader(System.`in`.reader()).use { br ->
        val st = StringTokenizer(br.readLine())
        Pair(st.nextToken().toInt(), st.nextToken().toInt())
    }
    val output = buildString {
        append(a / b)
        append(".")
        repeat(20) {
            a = (a % b) * 10
            append(a / b)
        }
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}