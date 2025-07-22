import java.io.BufferedWriter

fun main() {
    BufferedWriter(System.out.writer()).use {
        it.write("Hello")
        it.newLine()
        it.write("World")
    }
}