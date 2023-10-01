public class HalykCardPaymentMethod implements PaymentMethod {

    private String email;
    private String password;

    public HalykCardPaymentMethod(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public void pay(int amount){
    System.out.println(amount+" paid by Halyk card " );
    }

}
