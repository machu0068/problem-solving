import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(System.`in`.reader())
    val st = StringTokenizer(br.readLine())
    val (a, b, c) = Triple(
        st.nextToken().toInt(),
        st.nextToken().toInt(),
        st.nextToken().toInt()
    )
    val sum = a + b + c
    val avg = sum / 3
    BufferedWriter(System.out.writer()).use {
        it.write(sum.toString())
        it.newLine()
        it.write(avg.toString())
        it.newLine()
        it.write((sum - avg).toString())
    }
}