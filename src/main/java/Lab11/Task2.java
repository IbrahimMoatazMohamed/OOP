package Lab11;

interface Payment {
    void processPayment();
}

class CreditCardPayment implements Payment {
    private String firstName;
    private String lastName;
    private String cvv;
    private String visaNumber;

    public CreditCardPayment(String firstName, String lastName, String cvv, String visaNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cvv = cvv;
        this.visaNumber = visaNumber;
    }
    public CreditCardPayment(){}

    @Override
    public void processPayment(){
        System.out.println("This processed by Credit Card");
    }
}

class PayPalPaymentFactory implements Payment{
    private String email;
    private String password;

    public PayPalPaymentFactory(String email, String password) {
        this.email = email;
        this.password = password;
    }
    public PayPalPaymentFactory(){

    }

    @Override
    public void processPayment() {
        System.out.println("This processed by PayPal");
    }
}

enum PaymentType{
    PAYPAL,
    CREDITCARD
}

class PaymenFactoryMethod{
    public static Payment getPayment(PaymentType t){
        if(t.equals(PaymentType.CREDITCARD)){
            return new CreditCardPayment("Ibrahim", "moataz", "123", "412341234");
        }else if(t.equals(PaymentType.PAYPAL)){
            return new PayPalPaymentFactory("ibrahim@gmail.com", "asifhsoi");
        }else{
            return null;
        }
    }
}
class Main2{
    public static void main(String[] args) {
        CreditCardPayment creditCardPayment = (CreditCardPayment) PaymenFactoryMethod.getPayment(PaymentType.CREDITCARD);
        PayPalPaymentFactory payPalPaymentFactory = (PayPalPaymentFactory) PaymenFactoryMethod.getPayment(PaymentType.PAYPAL);
        creditCardPayment.processPayment();
        payPalPaymentFactory.processPayment();
    }
}