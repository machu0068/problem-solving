import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val st = StringTokenizer(br.readLine())
            bw.write(
                (st.nextToken().toInt()..st.nextToken().toInt())
                    .filter { it % 2 == 0 }
                    .sum()
                    .toString()
            )
        }
    }
}