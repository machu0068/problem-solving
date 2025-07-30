import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val output = BufferedReader(System.`in`.reader()).use { br ->
        val n = br.readLine().toInt()
        buildString {
            repeat(n) {
                StringTokenizer(br.readLine()).run {
                    val (a, b) = this.nextToken().toInt() to this.nextToken().toInt()
                    appendLine((a..b).fold(1, Int::times))
                }
            }
        }
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}