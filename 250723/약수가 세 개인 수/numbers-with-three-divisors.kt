import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val (start, end) = BufferedReader(System.`in`.reader()).use {
        val st = StringTokenizer(it.readLine())
        Pair(st.nextToken().toInt(), st.nextToken().toInt())
    }
    BufferedWriter(System.out.writer()).use {
        val result = (start..end).filter { it ->
            (1..it).filter { i -> it % i == 0 }.size == 3
        }.size
        it.write(result.toString())
    }
}