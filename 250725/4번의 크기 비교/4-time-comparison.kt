import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        val a = br.readLine().toInt()
        val st = StringTokenizer(br.readLine())
        val bcde = Array(4) { st.nextToken().toInt() }
        val output = bcde.map { it -> if (it < a) 1 else 0 }.joinToString("\n")
        BufferedWriter(System.out.writer()).use { bw -> bw.write(output) }
    }
}