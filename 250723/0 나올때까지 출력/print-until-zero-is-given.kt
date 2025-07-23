import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            bw.write(
                br.lineSequence()
                    .map { it.toInt() }
                    .takeWhile { it != 0 }
                    .joinToString("\n")
            )
        }
    }
}