import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        val map = Array(3) {
            val st = StringTokenizer(br.readLine())
            st.nextToken().first() to st.nextToken().toInt()
        }.groupingBy {
            when (it.first) {
                'Y' -> if (it.second >= 37) 'A' else 'C'
                else -> if (it.second >= 37) 'B' else 'D'
            }
        }.eachCount()
        val output = buildString {
            append(('A'..'D').joinToString(" ") { "${map[it] ?: 0}" })
            append(" ")
            if ((map['A'] ?: 0) >= 2) append("E")
        }
        BufferedWriter(System.out.writer()).use { it.write(output) }
    }
}