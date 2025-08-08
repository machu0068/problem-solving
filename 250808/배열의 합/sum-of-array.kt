import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        val output = Array(4) {
            StringTokenizer(br.readLine()).run {
                Array(4) { nextToken().toInt() }.sumOf { it }
            }
        }.joinToString("\n")
        BufferedWriter(System.out.writer()).use { it.write(output) }
    }
}