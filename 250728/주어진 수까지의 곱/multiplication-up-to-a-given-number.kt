import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val range = BufferedReader(System.`in`.reader()).use { br ->
        val st = StringTokenizer(br.readLine())
        (st.nextToken().toInt()..st.nextToken().toInt())
    }
    val output = range.reduce(Int::times).toString()
    BufferedWriter(System.out.writer()).use { it.write(output) }
}