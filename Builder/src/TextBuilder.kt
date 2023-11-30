class TextBuilder: Builder() {
    private var buffer = StringBuffer()

    override fun makeTitle(title: String) {
        buffer.append("====================\n")
        buffer.append("[ $title ]\n")
        buffer.append("\n")
    }

    override fun makeString(str: String) {
        buffer.append("■$str\n")
        buffer.append("\n")
    }

    override fun makeItems(items: List<String>) {
        for (element in items) {
            buffer.append("・${element}\n")
        }
        buffer.append("\n")
    }

    override fun close() {
        buffer.append("====================\n")
    }

    fun getResult(): String {
        return buffer.toString()
    }
}