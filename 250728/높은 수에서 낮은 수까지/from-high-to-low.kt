import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val (a, b) = BufferedReader(System.`in`.reader()).use { br ->
        val st = StringTokenizer(br.readLine())
        Pair(st.nextToken().toInt(), st.nextToken().toInt())
    }
    val range = when {
        a > b -> (a downTo b)
        else -> (b downTo a)
    }
    val output = range.joinToString(" ")
    BufferedWriter(System.out.writer()).use { it.write(output) }
}