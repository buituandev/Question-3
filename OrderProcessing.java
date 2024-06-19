
public class OrderProcessing {

    public void processOrder(String custormerName, String customerEmail, String shippingAddress, double orderTotal) {
        // Process the order
        System.out.println("Order processed successfully for " + custormerName);
    }

    public void sendOrderConfirmation(String customerEmail, String customerName) {
        // Send order confirmation
        System.out.println("Order confirmation sent to " + customerEmail);
    }

    public void generateInvoice(String customerName, double orderTotal) {
        // Generate invoice
        System.out.println("Invoice generated for " + customerName + " with total amount $" + orderTotal);
    }

    public static void main(String[] args) {
        OrderProcessing orderProcessing = new OrderProcessing();
        orderProcessing.processOrder("John Doe", "john.doe@example.com", "123 Main St, New York, NY", 100.0);
        orderProcessing.sendOrderConfirmation("John Doe", "john.doe@example.com");
        orderProcessing.generateInvoice("John Doe", 100.0);
    }

}

