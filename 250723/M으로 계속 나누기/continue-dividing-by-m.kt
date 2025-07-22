import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(System.`in`.reader())
    val st = StringTokenizer(br.readLine())
    var (n, m) = Pair(
        st.nextToken().toInt(),
        st.nextToken().toInt()
    )
    BufferedWriter(System.out.writer()).use {
        while (n > 0) {
            it.write(n.toString())
            it.newLine()
            n /= m
        }
    }
}