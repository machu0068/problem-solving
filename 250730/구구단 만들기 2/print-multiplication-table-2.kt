import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val (a, b) = BufferedReader(System.`in`.reader()).use { br ->
        val st = StringTokenizer(br.readLine())
        st.nextToken().toInt() to st.nextToken().toInt()
    }
    val output = (2..8 step 2).joinToString("\n") { i ->
        (b downTo a).joinToString(" / ") { dan ->
            "$dan * $i = ${dan * i}"
        }
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}