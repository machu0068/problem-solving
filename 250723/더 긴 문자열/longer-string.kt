import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(System.`in`.reader())
    val st = StringTokenizer(br.readLine())
    val (str1, str2) = Pair(
        st.nextToken(),
        st.nextToken(),
    )
    br.close()
    BufferedWriter(System.out.writer()).use {
        val longer = when {
            str1.length > str2.length -> str1
            str1.length < str2.length -> str2
            else -> null
        }
        val result = StringBuilder().apply {
            when (longer) {
                null -> append("same")
                else -> append(longer).append(" ").append(longer.length)
            }
        }.toString()
        it.write(result)
    }
}