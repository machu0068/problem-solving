import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(System.`in`.reader())
    val st = StringTokenizer(br.readLine())
    val (first, second) = Pair(
        st.nextToken().toInt(),
        st.nextToken().toInt()
    )
    br.close()
    val intArray = IntArray(10).apply {
        this[0] = first
        this[1] = second
        indices.drop(2).forEach { i ->
            this[i] = (this[i - 2] + this[i - 1]) % 10
        }
    }
    val result = buildString {
        intArray.forEach {
            append(it)
            append(" ")
        }
    }
    BufferedWriter(System.out.writer()).use {
        it.write(result)
    }
}