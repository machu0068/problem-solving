import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val n = br.readLine().toInt()
            val area = n * n
            val output = buildString {
                appendLine(area)
                if (n < 5) {
                    append("tiny")
                }
            }
            bw.write(output)
        }
    }
}