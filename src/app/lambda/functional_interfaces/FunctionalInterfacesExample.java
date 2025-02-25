package app.lambda.functional_interfaces;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class FunctionalInterfacesExample {
    public static void fullExample() {
        // 1️⃣ Supplier: Create a default customer
        Supplier<Customer> defaultCustomerSupplier = () -> new Customer("Default Customer", true);
        Customer defaultCustomer = defaultCustomerSupplier.get();

        // 2️⃣ Predicate: Check if a customer is active
        Predicate<Customer> isActiveCustomer = customer -> customer.isActive;

        // 3️⃣ Function: Convert customer names to uppercase
        Function<Customer, Customer> toUpperCaseName = customer ->
                new Customer(customer.name.toUpperCase(), customer.isActive);

        // 4️⃣ Consumer: Print customer details
        Consumer<Customer> displayCustomer = customer -> System.out.println("Customer: " + customer);

        // Sample customer list
        List<Customer> customers = Arrays.asList(
                new Customer("Alice", true),
                new Customer("Bob", false),
                new Customer("Charlie", true)
        );

        // 🏆 Processing Customers
        List<Customer> activeCustomers = customers.stream()
                .filter(isActiveCustomer)  // Filter active customers
                .map(toUpperCaseName)       // Convert names to uppercase
                .collect(Collectors.toList());

        // Display all active customers
        activeCustomers.forEach(displayCustomer);

        // Output:
        // Customer: Customer{name='ALICE', active=true}
        // Customer: Customer{name='CHARLIE', active=true}

        // Example of using Supplier
        System.out.println("Default Customer: " + defaultCustomer);
    }
}