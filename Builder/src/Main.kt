import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        exitProcess(0)
    }
    if (args[0] == "plain") {
        val textBuilder = TextBuilder()
        val director = Director(textBuilder)
        director.construct()
        val result = textBuilder.getResult()
        println(result)
    } else if (args[0] == "html") {
        val htmlBuilder = HTMLBuilder()
        val director = Director(htmlBuilder)
        director.construct()
        val fileName = htmlBuilder.fileName
        println("${fileName}が作成されました。")
    } else {
        exitProcess(0)
    }
}