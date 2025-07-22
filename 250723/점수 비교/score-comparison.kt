import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(System.`in`.reader())
    var st = StringTokenizer(br.readLine())
    val (aMath, aEng) = Pair(
        st.nextToken().toInt(),
        st.nextToken().toInt()
    )
    st = StringTokenizer(br.readLine())
    val (bMath, bEng) = Pair(
        st.nextToken().toInt(),
        st.nextToken().toInt()
    )
    BufferedWriter(System.out.writer()).use {
        it.write(
            if (aMath > bMath && aEng > bEng) "1" else "0"
        )
    }
    br.close()
}