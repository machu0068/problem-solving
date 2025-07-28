import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val (c, n) = BufferedReader(System.`in`.reader()).use { br ->
        val st = StringTokenizer(br.readLine())
        Pair(st.nextToken().first(), st.nextToken().toInt())
    }
    val range = when (c) {
        'A' -> (1..n)
        else -> (n downTo 1)
    }
    val output = buildString {
        append(range.joinToString(" "))
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}