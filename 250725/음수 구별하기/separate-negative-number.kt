import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val n = br.readLine().toInt()
            val output = buildString {
                appendLine(n)
                if (n < 0) {
                    append("minus")
                }
            }
            bw.write(output)
        }
    }
}