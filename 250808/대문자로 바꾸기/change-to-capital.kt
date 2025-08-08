import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        val output = Array(5) {
            StringTokenizer(br.readLine()).run {
                Array(3) { nextToken().first() }.joinToString(" ") { it.uppercase() }
            }
        }.joinToString("\n")
        BufferedWriter(System.out.writer()).use { it.write(output) }
    }
}