import factory.Factory
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        exitProcess(0)
    }
    println("====== ${args[0]}")
    val factory = Factory.getFactory(args[0])

    val asahi = factory!!.createLink(caption = "朝日新聞", url = "http://www.asahi.com/")
    val yomiuri = factory!!.createLink(caption = "読売新聞", url = "http://www.yomiuri.co.jp/")

    val usYahoo = factory!!.createLink(caption = "Yahoo!", url = "http://www.yahoo.com/")
    val jpYahoo = factory!!.createLink(caption = "Yahoo!Japan", url = "http://www.yahoo.co.jp/")
    val excite = factory!!.createLink(caption = "Excite", url = "http://www.excite.com/")
    val google = factory!!.createLink(caption = "Google", url = "http://www.google.com/")

    val trayNews = factory!!.createTray("新聞")
    trayNews?.add(asahi)
    trayNews?.add(yomiuri)

    val trayYahoo = factory!!.createTray("Yahoo!")
    trayYahoo.add(usYahoo)
    trayYahoo.add(jpYahoo)

    val traySearch = factory!!.createTray("サーチエンジン")
    traySearch.add(excite)
    traySearch.add(google)

    val page = factory!!.createPage(title = "LinkPage", author = "結城 浩")
    page.add(trayNews)
    page.add(traySearch)
    page.output()
}