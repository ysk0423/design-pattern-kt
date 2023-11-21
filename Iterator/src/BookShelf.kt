class BookShelf() : Aggregate {

    private val books = mutableListOf<Book>()
    private var last: Int = 0

    fun getBookAt(index: Int): Book = books[index]

    fun appendBook(book: Book) {
        books.add(book)
        last++
    }

    fun getLength() = last

    override fun iterator(): Iterator = BookShelfIterator(this)
}