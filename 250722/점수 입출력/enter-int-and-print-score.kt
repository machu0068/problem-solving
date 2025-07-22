import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val br = BufferedReader(System.`in`.reader())
    val bw = BufferedWriter(System.out.writer())
    val n = br.readLine().toInt()
    bw.write("Your score is $n point.")
    bw.flush()
    bw.close()
}