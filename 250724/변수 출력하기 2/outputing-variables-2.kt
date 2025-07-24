import java.io.BufferedWriter

fun main() {
    BufferedWriter(System.out.writer()).use {
        val a = 3
        val b = 'C'
        it.write("$b!.....!$a")
    }
}