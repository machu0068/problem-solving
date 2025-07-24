import java.io.BufferedWriter

fun main() {
    val a = 97
    val b = 13
    BufferedWriter(System.out.writer()).use {
        it.write("$a - $b = ${a - b}")
    }
}