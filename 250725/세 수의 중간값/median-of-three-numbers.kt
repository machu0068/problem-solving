import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val (a, b, c) = BufferedReader(System.`in`.reader()).use {
        val st = StringTokenizer(it.readLine())
        Triple(
            st.nextToken().toInt(),
            st.nextToken().toInt(),
            st.nextToken().toInt()
        )
    }
    BufferedWriter(System.out.writer()).use {
        it.write(
            when {
                a < b && b < c -> "1"
                else -> "0"
            }
        )
    }
}