package idcard

import framework.Product

class IDCard(
    val owner: String
): Product() {

    init {
        println("${owner}のカードを作ります。")
    }

    override fun use() {
        println("${owner}のカードを使います。")
    }
}