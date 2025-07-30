import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val (a, b) = BufferedReader(System.`in`.reader()).use { br ->
        val st = StringTokenizer(br.readLine())
        st.nextToken().toInt() to st.nextToken().toInt()
    }
    val range = b downTo a step 2
    val output = (1..9).joinToString("\n") { i ->
        range.joinToString(" / ") { dan ->
            "$dan * $i = ${dan * i}"
        }
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}