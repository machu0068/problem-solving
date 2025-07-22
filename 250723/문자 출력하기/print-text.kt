import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val br = BufferedReader(System.`in`.reader())
    val bw = BufferedWriter(System.out.writer())
    val c = br.readLine()
    repeat(8) {
        bw.write(c)
    }
    bw.flush()
    bw.close()
}