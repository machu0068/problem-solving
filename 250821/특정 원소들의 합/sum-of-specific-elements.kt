import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        val array = Array(4) {
            val st = StringTokenizer(br.readLine())
            Array(4) { st.nextToken().toInt() }
        }
        val output = array.indices.sumOf { i ->
            (0..i).sumOf { j ->
                array[i][j]
            }
        }.toString()
        BufferedWriter(System.out.writer()).use { it.write(output) }
    }
}