import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val (a, b) = BufferedReader(System.`in`.reader()).use { br ->
        val st = StringTokenizer(br.readLine())
        Pair(st.nextToken().toInt(), st.nextToken().toInt())
    }
    val iterator = (a..b).filter { it % 2 == 0 }.iterator()
    val output = buildString {
        while (iterator.hasNext()) {
            append(iterator.next())
            append(" ")
        }
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}