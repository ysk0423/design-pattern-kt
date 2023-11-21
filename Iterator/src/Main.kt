fun main() {
    val bookShelf = BookShelf()
    bookShelf.appendBook(Book("Around the World in 80 days"))
    bookShelf.appendBook(Book("Bible"))
    bookShelf.appendBook(Book("Cinderella"))
    bookShelf.appendBook(Book("Daddy-Long-Legs"))

    val it: Iterator = bookShelf.iterator()
    while (it.hasNext()) {
        val book = it.next() as Book
        println(book.name)
    }
}