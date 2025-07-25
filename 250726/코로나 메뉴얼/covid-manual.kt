import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        val array = Array(3) {
            StringTokenizer(br.readLine()).run {
                nextToken() to nextToken().toInt()
            }
        }
        BufferedWriter(System.out.writer()).use { bw ->
            bw.write(
                when {
                    array.filter { it.first == "Y" && it.second >= 37 }.size >= 2 -> "E"
                    else -> "N"
                }
            )
        }
    }
}