import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val st = StringTokenizer(br.readLine())
            val result = Array(10) { st.nextToken().toInt() }
                .let { e ->
                    val first = (1..9 step 2).sumOf { i -> e[i] }
                    val second = (2..9 step 3).map { i -> e[i] }.average()
                    first.toString() to "%.1f".format(second)
                }
            bw.write("${result.first} ${result.second}")
        }
    }
}