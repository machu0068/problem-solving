import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        val array = Array(5) { br.readLine().toInt() }
        val output = when (array.firstOrNull { it % 3 != 0 } == null) {
            true -> "1"
            false -> "0"
        }
        BufferedWriter(System.out.writer()).use { it.write(output) }
    }
}