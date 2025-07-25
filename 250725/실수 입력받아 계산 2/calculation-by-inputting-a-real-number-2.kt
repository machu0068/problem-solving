import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val a = br.readLine().toDouble()
            val output = buildString {
                append("%.2f".format(a + 1.5))
            }
            bw.write(output)
        }
    }
}