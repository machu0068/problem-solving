import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        val (a, b) = StringTokenizer(br.readLine()).run {
            nextToken().toInt() to nextToken().toInt()
        }
        val listA = StringTokenizer(br.readLine()).run {
            List(a) { nextToken().toInt() }
        }
        val listB = StringTokenizer(br.readLine()).run {
            List(b) { nextToken().toInt() }
        }
        val result = listA
            .windowed(b, 1)
            .any { it == listB }
        val output = if (result) "Yes" else "No"
        BufferedWriter(System.out.writer()).use { it.write(output) }
    }
}