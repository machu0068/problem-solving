import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val br = BufferedReader(System.`in`.reader())
    val n = br.readLine().toInt()
    BufferedWriter(System.out.writer()).use { bw ->
        repeat(n) {
            bw.write("LeebrosCode")
            bw.newLine()
        }
    }
}