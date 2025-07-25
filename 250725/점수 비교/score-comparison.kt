import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        val (aMath, aEng) = StringTokenizer(br.readLine()).run {
            nextToken().toInt() to nextToken().toInt()
        }
        val (bMath, bEng) = StringTokenizer(br.readLine()).run {
            nextToken().toInt() to nextToken().toInt()
        }
        val result = if (aMath > bMath && aEng > bEng) 1 else 0
        BufferedWriter(System.out.writer()).use { it.write(result.toString()) }
    }
}