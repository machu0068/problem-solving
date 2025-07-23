import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val st = StringTokenizer(br.readLine())
            val (n, m) = Pair(
                st.nextToken().toInt(),
                st.nextToken().toInt()
            )
            val arrayOne = Array(n) {
                val st = StringTokenizer(br.readLine())
                Array(m) { st.nextToken().toInt() }
            }
            val arrayTwo = Array(n) {
                val st = StringTokenizer(br.readLine())
                Array(m) { st.nextToken().toInt() }
            }
            bw.write(
                (0..n - 1).joinToString("\n") { i ->
                    (0..m - 1).joinToString(" ") { j ->
                        when {
                            arrayOne[i][j] == arrayTwo[i][j] -> "0"
                            else -> "1"
                        }
                    }
                }
            )
        }
    }
}