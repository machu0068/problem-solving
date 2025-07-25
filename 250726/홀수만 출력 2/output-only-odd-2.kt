import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val (b, a) = BufferedReader(System.`in`.reader()).use { br ->
        StringTokenizer(br.readLine()).run {
            nextToken().toInt() to nextToken().toInt()
        }
    }
    val output = (b downTo a).filter { it % 2 == 1 }.joinToString(" ")
    BufferedWriter(System.out.writer()).use { it.write(output) }
}