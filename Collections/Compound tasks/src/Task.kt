// Find the most expensive product among all the delivered products
// ordered by the customer. Use `Order.isDelivered` flag.
fun findMostExpensiveProductBy(customer: Customer): Product? {
    val products = customer.getDeliveredProducts()
    return products.maxByOrNull { it.price }
}

// Count the amount of times a product was ordered.
// Note that a customer may order the same product several times.
fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
    val products = customers.flatMap { it.getOrderedProducts() }
    return products.count { it == product }
}

fun Customer.getOrderedProducts(): List<Product> =
    orders.flatMap { it.products }
    
fun Customer.getDeliveredProducts(): List<Product> =
    orders.filter { it.isDelivered }.flatMap { it.products }
