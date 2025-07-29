import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val (a, b) = BufferedReader(System.`in`.reader()).use { br ->
        val st = StringTokenizer(br.readLine())
        st.nextToken().toInt() to st.nextToken().toInt()
    }
    val output = Array(a) { row ->
        Array(b) { col ->
            (col + 1) * (row + 1)
        }.joinToString(" ")
    }.joinToString("\n")
    BufferedWriter(System.out.writer()).use { it.write(output) }
}