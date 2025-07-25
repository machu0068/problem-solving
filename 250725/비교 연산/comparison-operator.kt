import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val (a, b) = BufferedReader(System.`in`.reader()).use {
        val st = StringTokenizer(it.readLine())
        Pair(st.nextToken().toInt(), st.nextToken().toInt())
    }
    val output = intArrayOf(
        if (a >= b) 1 else 0,
        if (a > b) 1 else 0,
        if (a <= b) 1 else 0,
        if (a < b) 1 else 0,
        if (a == b) 1 else 0,
        if (a != b) 1 else 0,
    ).joinToString("\n")
    BufferedWriter(System.out.writer()).use { it.write(output) }
}