import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use {
        val a = StringTokenizer(it.readLine()).run {
            nextToken().toInt() to nextToken()
        }
        val b = StringTokenizer(it.readLine()).run {
            nextToken().toInt() to nextToken()
        }
        BufferedWriter(System.out.writer()).use { bw ->
            bw.write(
                when {
                    a.first >= 19 && a.second == "M" || b.first >= 19 && b.second == "M" -> "1"
                    else -> "0"
                }
            )
        }
    }
}