import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val n = br.readLine().toInt()
            val array = Array(n) {
                val st = StringTokenizer(br.readLine())
                val average = Array(4) { st.nextToken().toInt() }.average()
                when {
                    average >= 60 -> "pass"
                    else -> "fail"
                }.also {
                    bw.write(it)
                    bw.write("\n")
                }
            }.filter { it == "pass" }
            bw.write(array.size.toString())
        }
    }
}