import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val output = buildString {
        BufferedReader(System.`in`.reader()).use { br ->
            generateSequence { br.readLine() }
                .any { line ->
                    val st = StringTokenizer(line)
                    Triple(
                        st.nextToken().toInt(),
                        st.nextToken().toInt(),
                        st.nextToken().first(),
                    ).let {
                        appendLine(it.first * it.second)
                        it.third == 'C'
                    }
                }
        }
    }
    BufferedWriter(System.out.writer()).use { it.write(output) }
}