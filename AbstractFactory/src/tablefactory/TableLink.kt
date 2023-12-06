package tablefactory

import factory.Link

class TableLink(
    caption: String,
    url: String
) : Link(caption, url) {
    override fun makeHTML(): String {
        return "<td><a href=\"$url\">$caption</a></td>\n"
    }
}