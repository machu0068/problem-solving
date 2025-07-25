import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        val intIterator = StringTokenizer(br.readLine()).run {
            IntArray(3) { nextToken().toInt() }
        }.iterator()
        var max = intIterator.nextInt()
        while (intIterator.hasNext()) {
            val e = intIterator.nextInt()
            if (max < e) max = e
        }
        BufferedWriter(System.out.writer()).use {
            it.write(max.toString())
        }
    }
}