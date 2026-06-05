class Book(
    val title: String,
    var pages: Int,
    val rating: Double,
    val isAvailable: Boolean
) {
    fun describe(): String {
        return "Book: $title | Pages: $pages | Rating: $rating | Available: $isAvailable"
    }

    fun isRecommended(): Boolean {
        return rating >= 4.0
    }
}

fun calculateAveragePages(booksPages: Array<Int>): Double {
    var sum = 0

    for (i in booksPages.indices) {   // intentional error
        sum += booksPages[i]
    }

    return sum.toDouble() // booksPages.size
}

fun checkBookLength(book: Book): String {
    if (book.pages == 300) {   // intentional error
        return "This is a medium-length book"
    } else if (book.pages > 300) {
        return "This is a long book"
    } else {
        return "This is a short book"
    }
}

fun countAvailableBooks(books: Array<Book>): Int {
    var counter = 0

    for (book in books) {
        if (book.isAvailable) {
            counter++
        }
    }

    return counter
}

fun main() {
    // Variables
    var appName: String = "Smart Community Library"   // intentional error
    val maxBooks: Int = 3
    var averageRating: Double = 4.2
    val libraryOpen: Boolean = true

    println("App name: $appName")
    println("Number of books: $maxBooks")
    println("Average rating: $averageRating")
    println("Library open: $libraryOpen")

    // Array
    val booksPages = arrayOf(120, 350, 280, 500)
    val averagePages = calculateAveragePages(booksPages)
    println("Average number of pages: $averagePages")

    // Objects
    val book1 = Book("The Green City", 350, 4.5, true)
    val book2 = Book("Future Skills", 220, 3.8, false)
    val book3 = Book("Young Innovators", 410, 4.7, true)

    val books = arrayOf(book1, book2, book3)

    println(books[2].describe())   // intentional error

    for (book in books) {
        println(book.describe())
        println(checkBookLength(book))
    }

    val availableCount = countAvailableBooks(books)
    println("Number of available books: $availableCount")

    if (availableCount > 1) {
        println("More than one book is available")
    } else {
        println("Only a few books are available")
    }
}