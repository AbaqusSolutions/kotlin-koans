# Initialize health checks lazily

You have a system health checker that can determine the state of a cloud system. However, the two functions it can run 
to perform a health check are performance intensive. Use lazy properties to initialize the checks so that the expensive
functions are only run when needed:

From [Properties](https://kotlinlang.org/docs/kotlin-tour-intermediate-properties.html).
