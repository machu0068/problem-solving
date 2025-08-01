import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(System.`in`.reader())
    val st = StringTokenizer(br.readLine())
    val (a, b) = Pair(st.nextToken(), st.nextToken())
    BufferedWriter(System.out.writer()).use {
        it.write("$b $a")
    }
}