import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        val c = br.readLine().first()
        val output = buildString {
            repeat(8) {
                append(c)
            }
        }
        BufferedWriter(System.out.writer()).use { it.write(output) }
    }
}