import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val a = br.readLine().toInt()
            val output = buildString {
                append(a * 2 + 3)
            }
            bw.write(output)
        }
    }
}