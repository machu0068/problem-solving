import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        val a = StringTokenizer(br.readLine()).run {
            nextToken().toInt() to nextToken().toInt()
        }
        val b = StringTokenizer(br.readLine()).run {
            nextToken().toInt() to nextToken().toInt()
        }
        BufferedWriter(System.out.writer()).use {
            it.write(
                when {
                    a.first == b.first -> when {
                        a.second < b.second -> "B"
                        else -> "A"
                    }

                    a.first < b.first -> "B"
                    else -> "A"
                }
            )
        }
    }
}