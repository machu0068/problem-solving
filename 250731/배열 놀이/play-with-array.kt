import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        val (n, q) = StringTokenizer(br.readLine()).run {
            nextToken().toInt() to nextToken().toInt()
        }
        val st = StringTokenizer(br.readLine())
        val array = Array(n) {
            st.nextToken().toInt()
        }
        val output = buildString {
            repeat(q) {
                StringTokenizer(br.readLine()).run {
                    when (nextToken()) {
                        "1" -> {
                            val a = nextToken().toInt()
                            appendLine(array[a - 1])
                        }

                        "2" -> {
                            val b = nextToken().toInt()
                            appendLine(array.indexOfFirst { it == b } + 1)
                        }

                        "3" -> {
                            val (s, e) = nextToken().toInt() to nextToken().toInt()
                            appendLine(
                                (s..e).joinToString(" ") { array[it - 1].toString() }
                            )
                        }
                    }
                }
            }
        }
        BufferedWriter(System.out.writer()).use { it.write(output) }
    }
}