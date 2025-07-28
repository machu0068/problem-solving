import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val resultList = BufferedReader(System.`in`.reader()).use { br ->
        val array = Array(10) { br.readLine().toInt() }
        listOf(
            array.filter { it % 3 == 0 }.size,
            array.filter { it % 5 == 0 }.size
        )
    }
    BufferedWriter(System.out.writer()).use {
        it.write(resultList.joinToString(" "))
    }
}