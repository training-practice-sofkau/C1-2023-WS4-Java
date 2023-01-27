package strategy;

class CreditCardStrategy implements PaymentStrategy {
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;


    @Override
    public void collectPaymentDetails() {
        name = "Credit Card";
        cardNumber = "cardNumber";
        cvv = "cvv";
        dateOfExpiry = "dateOfExpiry";
    }

    @Override
    public boolean validatePaymentDetails() {
        return true;
    }

    @Override
    public void pay(double amount) {
        System.out.println("You paid: " + amount + " Using a Credit/debit card");
    }
}
