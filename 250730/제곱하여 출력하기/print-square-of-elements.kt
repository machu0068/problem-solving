import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer
import kotlin.math.pow

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val n = br.readLine().toInt()
            val st = StringTokenizer(br.readLine())
            val output = Array(n) { st.nextToken().toInt() }
                .map { it.toDouble().pow(2).toInt() }
                .joinToString(" ")
            bw.write(output)
        }
    }
}