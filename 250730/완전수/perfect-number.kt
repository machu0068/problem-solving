import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val (start, end) = BufferedReader(System.`in`.reader()).use { br ->
        val st = StringTokenizer(br.readLine())
        st.nextToken().toInt() to st.nextToken().toInt()
    }
    val output = (start..end).filter { num ->
        num == (1 until num).filter { num % it == 0 }.sum()
    }.size.toString()
    BufferedWriter(System.out.writer()).use { it.write(output) }
}