package factory

import java.io.FileWriter
import java.io.IOException

abstract class Page(
    val title: String,
    val author: String
) {
    protected val content = mutableListOf<Item>()

    fun add(item: Item) {
        content.add(item)
    }

    abstract fun makeHTML(): String

    fun output() {
        try {
            val fileName = "./AbstractFactory/src/${title}.html"
            val writer = FileWriter(fileName)
            writer.write(this.makeHTML())
            writer.close()
            println("${fileName}を作成しました。")
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

}