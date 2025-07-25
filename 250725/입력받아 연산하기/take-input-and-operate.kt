import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            var a = br.readLine().toInt()
            var b = br.readLine().toInt()
            a += 87
            b %= 10
            val output = buildString {
                appendLine(a)
                appendLine(b)
            }
            bw.write(output)
        }
    }
}