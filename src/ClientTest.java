public class ClientTest {
    public static void main(String[] args) {
        Shoppingcart shoppingcart = new Shoppingcart();
        Product product1 = new Product("Laptop", "1232344", 100);
        Product product2 = new Product("Phone", "545423579", 102);
        Product product3 = new Product("Printer", "82326598", 140);

        shoppingcart.addProduct(product1);
        shoppingcart.addProduct(product2);
        shoppingcart.addProduct(product3);

        PaymentMethod paymentMethod = new KaspiCardPaymentMethod("MA", "9329329", "848", "11/23");
        shoppingcart.payment(paymentMethod);

        System.out.println("---------------------------------------------------------------------------");

        shoppingcart = new Shoppingcart();

        product1 = new Product("Computer", "44234", 10000);
        product2 = new Product("Mouse", "54456", 10200);

        shoppingcart.addProduct(product1);
        shoppingcart.addProduct(product2);

        PaymentMethod halykPaymentMethod = new HalykCardPaymentMethod("AlibekMM@gmail.kz", "Labka:100%");
        shoppingcart.payment(halykPaymentMethod);
    }
}
