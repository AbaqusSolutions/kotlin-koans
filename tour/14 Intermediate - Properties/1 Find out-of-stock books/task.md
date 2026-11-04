# Find out-of-stock books

You manage an inventory system at a bookstore. The inventory is stored in a list where each item represents the quantity
of a specific book. For example, `listOf(3, 0, 7, 12)` means the store has 3 copies of the first book, 0 of the second,
7 of the third, and 12 of the fourth.

Write a function called `findOutOfStockBooks()` that returns a list of indices for all the books that are out of stock.

**Hint 1:** Use the [`indices`](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/indices.html) extension property from the standard library.

**Hint 2:** You can use the [`buildList()`](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.collections/build-list.html) function to create and manage a list instead of manually creating and returning a mutable list. The `buildList()` function uses a lambda with a receiver, which you learned about in earlier chapters.

From [Properties](https://kotlinlang.org/docs/kotlin-tour-intermediate-properties.html).
