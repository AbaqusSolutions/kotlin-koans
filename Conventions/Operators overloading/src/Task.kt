import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

// Supported intervals that might be added to dates:
enum class TimeInterval { DAY, WEEK, YEAR;
    operator fun times(n: Int): DateSomething = DateSomething(this, n)
}

data class DateSomething (val timeInterval: TimeInterval, val n: Int)

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = addTimeIntervals(timeInterval, 1)

operator fun MyDate.plus(dateSomething: DateSomething): MyDate =
    addTimeIntervals(dateSomething.timeInterval, dateSomething.n)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}
