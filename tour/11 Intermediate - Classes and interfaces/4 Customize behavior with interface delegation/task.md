# Customize behavior with interface delegation

You have a simple messaging app that has some basic functionality, but you want to add some functionality for 
_smart_ messages without significantly duplicating your code.

In the code below, define a class called `SmartMessenger` that inherits from the `Messenger` interface but delegates 
the implementation to an instance of the `BasicMessenger` class. 

In the `SmartMessenger` class, override the `sendMessage()` function to send smart messages. The function must accept
a `message` as an input and return a printed statement: `"Sending a smart message: $message"`. In addition, call the 
`sendMessage()` function from the `BasicMessenger` class and prefix the message with `[smart]`.

> You don't need to rewrite the `receiveMessage()` function in the `SmartMessenger` class.

From [Classes and interfaces](https://kotlinlang.org/docs/kotlin-tour-intermediate-classes-interfaces.html).
