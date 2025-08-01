import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        val array = StringTokenizer(br.readLine()).run {
            Array(10) { nextToken().toInt() }
        }
        BufferedWriter(System.out.writer()).use { it.write(array.maxOrNull().toString()) }
    }
}