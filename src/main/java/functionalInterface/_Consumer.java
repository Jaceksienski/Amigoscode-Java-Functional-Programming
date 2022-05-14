package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        //Normal Java function
        Customer jaca = new Customer("Jaca", "99999");
        greetCustomer(jaca);
        greetCustomerV2(jaca, false);

        // Consumer Functional interface
        greetCustomerConsumer.accept(jaca);
        greetCustomerConsumerV2.accept(jaca, false);
    }

    static Consumer<Customer> greetCustomerConsumer =
            customer -> System.out.println("Hello " + customer.customerName +
                    ", thanks for registering phone number " +
                    customer.customerPhoneNumber);

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 =
            (customer, showPhoneNumber) -> System.out.println("Hello " + customer.customerName +
                    ", thanks for registering phone number " +
                    (showPhoneNumber ? customer.customerPhoneNumber : "******"));


    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName +
                ", thanks for registering phone number " +
                customer.customerPhoneNumber);
    }

    static void greetCustomerV2(Customer customer, boolean showPhoneNumber) {
        System.out.println("Hello " + customer.customerName +
                ", thanks for registering phone number " +
                (showPhoneNumber ? customer.customerPhoneNumber : "******"));
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
