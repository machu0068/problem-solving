import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(System.`in`.reader())
    val st = StringTokenizer(br.readLine())
    val (a, b) = Pair(
        st.nextToken().toInt(),
        st.nextToken().toInt()
    )
    BufferedWriter(System.out.writer()).use {
        it.write(if (a < b) "1" else "0")
        it.write(" ")
        it.write(if (a == b) "1" else "0")
    }
}