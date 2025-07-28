import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val array = BufferedReader(System.`in`.reader()).use { br ->
        val st = StringTokenizer(br.readLine())
        (st.nextToken().toInt()..st.nextToken().toInt())
    }.filter { it % 5 == 0 || it % 7 == 0 }
    val output = buildString {
        append(array.sum())
        append(" ")
        append("%.1f".format(array.average()))
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}