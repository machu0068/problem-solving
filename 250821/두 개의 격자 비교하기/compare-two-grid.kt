import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val (array1, array2) = BufferedReader(System.`in`.reader()).use { br ->
        val (n, m) = StringTokenizer(br.readLine()).run {
            nextToken().toInt() to nextToken().toInt()
        }

        fun getArray() = Array(n) {
            val st = StringTokenizer(br.readLine())
            Array(m) { st.nextToken().toInt() }
        }

        getArray() to getArray()
    }

    val output = array1.zip(array2).joinToString("\n") { (row1, row2) ->
        row1.zip(row2).map { (a, b) -> if (a == b) 0 else 1 }.joinToString(" ")
    }

    BufferedWriter(System.out.writer()).use { it.write(output) }
}