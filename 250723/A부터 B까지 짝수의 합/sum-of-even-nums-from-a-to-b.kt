import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val (a, b) = BufferedReader(System.`in`.reader()).use {
        val st = StringTokenizer(it.readLine())
        Pair(st.nextToken().toInt(), st.nextToken().toInt())
    }
    val sum = (a..b).filter { it % 2 == 0 }.sum()
    BufferedWriter(System.out.writer()).use {
        it.write(sum.toString())
    }
}