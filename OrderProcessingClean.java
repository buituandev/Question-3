
public class OrderProcessingClean {

    public void processOrder(Customer customer) {
        // Process the order
        System.out.println("Order processed successfully for " + customer.name);
    }

    public void sendOrderConfirmation(Customer customer) {
        // Send order confirmation
        System.out.println("Order confirmation sent to " + customer.email);
    }

    public void generateInvoice(Customer customer) {
        // Generate invoice
        System.out.println("Invoice generated for " + customer.name + " with total amount $" + customer.orderTotal);
    }

    public static void main(String[] args) {
        OrderProcessingClean orderProcessing = new OrderProcessingClean();
        Customer customer = new Customer("John Doe", "john.doe@example.com", "123 Main St, New York, NY", 100.0);
        orderProcessing.processOrder(customer);
        orderProcessing.sendOrderConfirmation(customer);
        orderProcessing.generateInvoice(customer);
    }

}

class Customer {

    String name;
    String email;
    String address;
    double orderTotal;

    public Customer(String name, String email, String address, double orderTotal) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.orderTotal = orderTotal;
    }
}
