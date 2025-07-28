import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val (a, b) = BufferedReader(System.`in`.reader()).use { br ->
        val st = StringTokenizer(br.readLine())
        Pair(st.nextToken().toInt(), st.nextToken().toInt())
    }
    val output = generateSequence(a) { curr ->
        val next = if (curr % 2 == 0) curr + 3 else curr * 2
        if (next <= b) next else null
    }.joinToString(" ")
    BufferedWriter(System.out.writer()).use { it.write(output) }
}