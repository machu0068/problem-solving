import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    val intArray = BufferedReader(System.`in`.reader()).use { br ->
        IntArray(10) { br.readLine().toInt() }
    }
    val countThree = intArray.count { it % 3 == 0 }
    val countFive = intArray.count { it % 5 == 0 }
    BufferedWriter(System.out.writer()).use {
        it.write("$countThree $countFive")
    }
}