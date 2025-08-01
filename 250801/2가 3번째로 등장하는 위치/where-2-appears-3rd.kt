import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        val n = br.readLine().toInt()
        val array = StringTokenizer(br.readLine()).run {
            Array(n) { nextToken().toInt() }
        }
        val result = array
            .runningFold(0) { acc, value -> if (value == 2) acc + 1 else acc }
            .takeWhile { it < 3 }
            .size
        BufferedWriter(System.out.writer()).use { it.write(result.toString()) }
    }
}