import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(System.`in`.reader())
    val st = StringTokenizer(br.readLine())
    val nums = listOf(
        st.nextToken().toInt(),
        st.nextToken().toInt(),
        st.nextToken().toInt()
    )
    val median = nums.sorted()[1]
    BufferedWriter(System.out.writer()).use {
        it.write(median.toString())
    }
}