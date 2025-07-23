import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val arrayOne = Array(3) {
                val st = StringTokenizer(br.readLine())
                Array(3) { st.nextToken().toInt() }
            }
            br.readLine()
            val arrayTwo = Array(3) {
                val st = StringTokenizer(br.readLine())
                Array(3) { st.nextToken().toInt() }
            }
            bw.write(
                (0..2).joinToString("\n") { i ->
                    (0..2).joinToString(" ") { j ->
                        "${arrayOne[i][j] * arrayTwo[i][j]}"
                    }
                }
            )
        }
    }
}