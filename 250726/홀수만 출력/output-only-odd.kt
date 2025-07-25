import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val (a, b) = BufferedReader(System.`in`.reader()).use { br ->
        StringTokenizer(br.readLine()).run {
            nextToken().toInt() to nextToken().toInt()
        }
    }
    val output = (a..b).filter { it % 2 == 1 }.joinToString(" ")
    BufferedWriter(System.out.writer()).use { it.write(output) }
}