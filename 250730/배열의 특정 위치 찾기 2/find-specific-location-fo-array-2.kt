import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer
import kotlin.math.abs

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val st = StringTokenizer(br.readLine())
            val numbers = Array(10) { st.nextToken().toInt() }
            val (itemsAtEvenIndices, itemsAtOddIndices) = numbers
                .withIndex()
                .partition { it.index % 2 == 0 }
            val output = abs(itemsAtEvenIndices.sumOf { it.value } - itemsAtOddIndices.sumOf { it.value }).toString()
            bw.write(output)
        }
    }
}