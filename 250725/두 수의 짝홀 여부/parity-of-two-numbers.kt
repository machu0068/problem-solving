import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val (a, b) = BufferedReader(System.`in`.reader()).use {
        val st = StringTokenizer(it.readLine())
        Pair(st.nextToken().toInt(), st.nextToken().toInt())
    }
    BufferedWriter(System.out.writer()).use { bw ->
        listOf(a, b).forEach {
            bw.write(
                when (it % 2 == 0) {
                    true -> "even"
                    false -> "odd"
                }
            )
            bw.newLine()
        }
    }
}