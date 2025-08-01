import java.io.BufferedReader
import java.io.BufferedWriter
import java.util.StringTokenizer

fun main() {
    BufferedReader(System.`in`.reader()).use { br ->
        val n = br.readLine().toInt()
        val prices = StringTokenizer(br.readLine()).run {
            List(n) { nextToken().toInt() }
        }
        val output = prices
            .fold(Pair(Int.MAX_VALUE, 0)) { (minPrice, maxProfit), price ->
                val newMin = minOf(minPrice, price)
                val profit = price - newMin
                val newMaxProfit = maxOf(maxProfit, profit)
                newMin to newMaxProfit
            }.second.toString()
        BufferedWriter(System.out.writer()).use { it.write(output) }
    }
}