import java.io.FileWriter
import java.io.IOException
import java.io.PrintWriter

class HTMLBuilder: Builder() {

    lateinit var fileName: String
    private lateinit var writer: PrintWriter

    override fun makeTitle(title: String) {
        fileName = "./Builder/$title.html"
        try {
            writer = PrintWriter(FileWriter(fileName))
        } catch (e: IOException) {
            e.printStackTrace()
        }
        writer.println("<html><head><title>$title</title></head><body>")
        writer.println("<h1>$title</h1>")
    }

    override fun makeString(str: String) {
        writer.println("<p>$str</p>")
    }

    override fun makeItems(items: List<String>) {
        writer.println("<ul>")
        for (item in items) {
            writer.println("<li>$item</li>")
        }
        writer.println("</ul>")
    }

    override fun close() {
        writer.println("</body></html>")
        writer.close()
    }
}