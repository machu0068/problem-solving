import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val array = Array(3) {
                val st = StringTokenizer(br.readLine())
                Array(3) { st.nextToken().toInt() }
            }
            bw.write(
                array.joinToString("\n") { row ->
                    row.map { it * 3 }.joinToString(" ")
                }
            )
        }
    }
}