import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val array = Array(4) {
                val st = StringTokenizer(br.readLine())
                Array(4) { st.nextToken().toInt() }
            }
            bw.write(
                (0 until 4).joinToString("\n") { i -> array[i].sum().toString() }
            )
        }
    }
}