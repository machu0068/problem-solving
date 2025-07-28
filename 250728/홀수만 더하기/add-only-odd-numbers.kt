import java.io.BufferedReader
import java.io.BufferedWriter

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        BufferedWriter(System.out.writer()).use { bw ->
            val n = br.readLine().toInt()
            val array = Array(n) { br.readLine().toInt() }
            val output = array.filter { it % 2 == 1 && it % 3 == 0 }.sum().toString()
            bw.write(output)
        }
    }
}