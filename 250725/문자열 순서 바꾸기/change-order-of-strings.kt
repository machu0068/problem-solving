import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val (s, t) = Pair(
                br.readLine(),
                br.readLine()
            )
            val output = buildString {
                appendLine(t)
                appendLine(s)
            }
            bw.write(output)
        }
    }
}