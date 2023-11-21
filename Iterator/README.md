## クラス図

```mermaid
classDiagram
  class Aggregate {
      <<interface>>
      iterator()
  }
  class Iterator {
      <<interface>>
      hasNext()
      next()
  }
  Aggregate ..> Iterator : Creates
  Aggregate <|.. BookShelf
  Iterator <|.. BookShelfIterator
  class BookShelf {
      -books
      -last
      +getBookAt()
      +appendBook()
      +getLength()
      +iterator()
  }
  class BookShelfIterator {
      -bookShelf
      -index
      +hasNext()
      +next()
  }
  BookShelf <--o BookShelfIterator
  class Book {
      -name
      +getName()
  }
  BookShelf o--> Book : contains
```