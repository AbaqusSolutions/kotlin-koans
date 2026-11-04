# Track budget changes

You're building a simple budget tracker app. The app needs to observe changes to the user's remaining budget and notify
them whenever it goes below a certain threshold. You have a `Budget` class that is initialized with a `totalBudget` property
that contains the initial budget amount. Within the class, create an observable property called `remainingBudget` that prints:

* A warning when the value is lower than 20% of the initial budget.
* An encouraging message when the budget is increased from the previous value.

From [Properties](https://kotlinlang.org/docs/kotlin-tour-intermediate-properties.html).
