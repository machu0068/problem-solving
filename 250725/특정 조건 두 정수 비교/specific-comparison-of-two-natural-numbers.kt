import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val (a, b) = BufferedReader(System.`in`.reader()).use {
        val st = StringTokenizer(it.readLine())
        Pair(st.nextToken().toInt(), st.nextToken().toInt())
    }
    val output = listOf(
        when (a < b) {
            true -> "1"
            false -> "0"
        },
        when (a == b) {
            true -> "1"
            false -> "0"
        }
    ).joinToString(" ")
    BufferedWriter(System.out.writer()).use { it.write(output) }
}