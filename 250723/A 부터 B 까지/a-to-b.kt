import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val (a, b) = BufferedReader(System.`in`.reader()).use {
        val st = StringTokenizer(it.readLine())
        Pair(st.nextToken().toInt(), st.nextToken().toInt())
    }
    val sequence = generateSequence(a) {
        if (it % 2 == 0) it + 3 else it * 2
    }.takeWhile { it <= b }
    BufferedWriter(System.out.writer()).use {
        it.write(sequence.joinToString(" "))
    }
}