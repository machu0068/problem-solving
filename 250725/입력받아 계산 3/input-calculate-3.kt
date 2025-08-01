import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val (a, b) = Pair(
                br.readLine().toInt(),
                br.readLine().toInt()
            )
            val output = buildString {
                append(a * b)
            }
            bw.write(output)
        }
    }
}