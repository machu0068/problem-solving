import java.io.BufferedWriter

fun main() {
    val bw = BufferedWriter(System.out.writer())
    var a = 'C'
    a = 'T'

    bw.write(a.toString())
    bw.flush()
    bw.close()
}