import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val intIterator = BufferedReader(System.`in`.reader()).use { br ->
        StringTokenizer(br.readLine()).run {
            IntArray(3) { nextToken().toInt() }
        }
    }.iterator()
    var min = intIterator.nextInt()
    while (intIterator.hasNext()) {
        val e = intIterator.nextInt()
        if (min > e) {
            min = e
        }
    }
    BufferedWriter(System.out.writer()).use { bw ->
        bw.write(min.toString())
    }
}