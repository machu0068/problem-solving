import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val (n, m) = BufferedReader(System.`in`.reader()).use {
        val st = StringTokenizer(it.readLine())
        Pair(st.nextToken().toInt(), st.nextToken().toInt())
    }
    BufferedWriter(System.out.writer()).use {
        val result = Array(n) {
            Array(m) { "*" }.joinToString(" ")
        }.joinToString("\n")
        it.write(result)
    }
}