import java.io.BufferedWriter

fun main() {
    BufferedWriter(System.out.writer()).use {
        val a = 1
        val b = 2
        val c = 'C'
        it.write("$a->$b->$c")
    }
}