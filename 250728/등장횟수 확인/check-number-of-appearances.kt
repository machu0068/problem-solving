import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            bw.write(
                Array(5) { br.readLine().toInt() }
                    .filter { it % 2 == 0 }
                    .size
                    .toString()
            )
        }
    }
}