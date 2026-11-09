class DateRange(val start: MyDate, val end: MyDate): Iterable<MyDate>{
    override fun iterator(): Iterator<MyDate> {
        return object: Iterator<MyDate> {
            var current = start
            override fun hasNext() = current.followingDate() <= end.followingDate()
            override fun next(): MyDate {
                val temp = current
                current = current.followingDate()
                return temp
            }
        }
    }
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}