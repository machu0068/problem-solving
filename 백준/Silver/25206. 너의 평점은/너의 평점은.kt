import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    var totalCredit = 0.0
    var sum = 0.0
    repeat(20) {
        val (_, credit, grade) = reader.readLine().split(" ").map { it }
        if (grade == "P") return@repeat
        val average = when (grade) {
            "A+" -> 4.5
            "A0" -> 4.0
            "B+" -> 3.5
            "B0" -> 3.0
            "C+" -> 2.5
            "C0" -> 2.0
            "D+" -> 1.5
            "D0" -> 1.0
            else -> 0.0
        }
        sum += average * credit.toDouble()
        totalCredit += credit.toDouble()
    }

    writer.write("${sum / totalCredit}")

    writer.flush()
    writer.close()
    reader.close()
}
