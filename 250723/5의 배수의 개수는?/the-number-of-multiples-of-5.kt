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
            val cnt = array
                .map { it.count { num -> num % 5 == 0 } }
                .fold(0) { acc, value -> acc + value }
            bw.write(cnt.toString())
        }
    }
}