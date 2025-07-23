import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val strArray = arrayOf("apple", "banana", "grape", "blueberry", "orange")
    val c = BufferedReader(System.`in`.reader()).use {
        it.readLine().first()
    }
    val result = strArray.filter { it[2] == c || it[3] == c }
    BufferedWriter(System.out.writer()).use { bw ->
        result.forEach {
            bw.write(it)
            bw.newLine()
        }
        bw.write(result.size.toString())
    }
}