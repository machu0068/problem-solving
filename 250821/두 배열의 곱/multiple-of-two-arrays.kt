import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(System.`in`.reader())

    fun getArray(): Array<Array<Int>> {
        val array = Array(3) {
            val st = StringTokenizer(br.readLine())
            Array(3) { st.nextToken().toInt() }
        }
        return array
    }

    val array1 = getArray()
    br.readLine()
    val array2 = getArray()

    val output = Array(3) { i ->
        Array(3) { j ->
            array1[i][j] * array2[i][j]
        }.joinToString(" ")
    }.joinToString("\n")

    BufferedWriter(System.out.writer()).use { it.write(output) }
}