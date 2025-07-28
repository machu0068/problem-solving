import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer
import kotlin.math.pow

fun main() {
    val (a, b) = BufferedReader(System.`in`.reader()).use { br ->
        val st = StringTokenizer(br.readLine())
        Pair(st.nextToken().toInt(), st.nextToken().toInt())
    }
    val output = a.toDouble().pow(b).toInt().toString()
    BufferedWriter(System.out.writer()).use { it.write(output) }
}