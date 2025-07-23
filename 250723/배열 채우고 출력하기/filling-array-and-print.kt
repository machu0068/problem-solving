import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(System.`in`.reader())
    val st = StringTokenizer(br.readLine())
    br.close()
    val size = st.countTokens()
    val lastIndex = size - 1
    val charArray = CharArray(size) { st.nextToken()[0] }
    val resultArray = CharArray(size)
    for (i in 0..lastIndex) {
        resultArray[i] = charArray[lastIndex - i]
    }
    BufferedWriter(System.out.writer()).use {
        it.write(resultArray)
    }
}