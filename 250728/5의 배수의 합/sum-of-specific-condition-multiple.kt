import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val output = BufferedReader(System.`in`.reader()).use { br ->
        val st = StringTokenizer(br.readLine())
        val (a, b) = listOf(st.nextToken().toInt(), st.nextToken().toInt()).sorted()
        (a..b)
    }
        .filter { it % 5 == 0 }
        .sum()
        .toString()
    BufferedWriter(System.out.writer()).use { it.write(output) }
}