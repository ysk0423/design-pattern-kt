import framework.Factory
import framework.Product
import idcard.IDCardFactory

fun main() {
    val factory: Factory = IDCardFactory()
    val card1: Product = factory.create("結城浩")
    val card2 = factory.create("とむら")
    val card3 = factory.create("佐藤花子")

    card1.use()
    card2.use()
    card3.use()
}