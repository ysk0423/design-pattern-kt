package tablefactory

import factory.Factory
import factory.Link
import factory.Page
import factory.Tray

class TableFactory: Factory() {
    override fun createLink(caption: String, url: String): Link {
        return TableLink(caption, url)
    }

    override fun createTray(caption: String): Tray {
        return TableTray(caption)
    }

    override fun createPage(title: String, author: String): Page {
        return TablePage(title, author)
    }
}