import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(System.`in`.reader())
    val st = StringTokenizer(br.readLine())
    var (a, n) = Pair(
        st.nextToken().toInt(),
        st.nextToken().toInt()
    )
    BufferedWriter(System.out.writer()).use { bw ->
        repeat(n) {
            a += n
            bw.write(a.toString())
            bw.newLine()
        }
    }
}