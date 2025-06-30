import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    val s = reader.readLine().toCharArray()
    var isPalindrome = true
    for (i in 0..s.size - 1) {
        if (s[i] != s[s.size - i - 1]) {
            isPalindrome = false
            break
        }
    }

    writer.write("${if (isPalindrome) 1 else 0}")

    writer.flush()
    writer.close()
    reader.close()
}
