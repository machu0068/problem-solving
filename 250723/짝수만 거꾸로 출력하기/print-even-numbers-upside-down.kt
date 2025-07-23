import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(System.`in`.reader())
    val n = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())
    val intArray = IntArray(n) { st.nextToken().toInt() }
    br.close()
    val result = StringBuilder().apply {
        intArray.reversed().map {
            if (it % 2 == 0) {
                append(it)
                append(" ")
            }
        }
    }.toString()
    BufferedWriter(System.out.writer()).use {
        it.write(result)
    }
}