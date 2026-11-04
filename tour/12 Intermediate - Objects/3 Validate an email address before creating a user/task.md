# Validate an email address before creating a user

You are building a user registration module for an app. You want to keep email validation associated with the `User`
class but don't want to create an unnecessary `User` instance if the email address is invalid.

For this exercise, consider an email address valid if it contains both `@` and `.`. Complete the data class so that the
following code in the `main()` function runs successfully:

**Hint:** Add an email validation function in a companion object for the `User` class so that you can call the function directly on `User`.

From [Objects](https://kotlinlang.org/docs/kotlin-tour-intermediate-objects.html).
