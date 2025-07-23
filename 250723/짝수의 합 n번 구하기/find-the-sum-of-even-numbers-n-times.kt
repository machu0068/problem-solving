import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val n = br.readLine().toInt()
            repeat(n) {
                val st = StringTokenizer(br.readLine())
                val (a, b) = Pair(
                    st.nextToken().toInt(),
                    st.nextToken().toInt()
                )
                val sum = (a..b).filter { it % 2 == 0 }.sum()
                bw.write(sum.toString())
                bw.newLine()
            }
        }
    }
}