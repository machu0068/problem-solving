import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val n = br.readLine().toInt()
            val output = buildString {
                append(
                    when {
                        n >= 80 -> "pass"
                        else -> "${80 - n} more score"
                    }
                )
            }
            bw.write(output)
        }
    }
}