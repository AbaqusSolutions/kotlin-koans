fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean = when {
    date in first..last -> true
    else -> false
}
