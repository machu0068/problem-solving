import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        val n = br.readLine().toInt()
        val numbers = StringTokenizer(br.readLine()).run {
            List(n) { nextToken().toInt() }
        }
        val output = numbers
            .zipWithNext()
            .minOfOrNull { it.second - it.first }
            .toString()
        BufferedWriter(System.out.writer()).use { it.write(output) }
    }
}