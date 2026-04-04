// practical 4: method overloading ,different ttypes of transaction modes used for tranfering money.
class Transaction {
// net banking
    void transfer(int amount) {
        System.out.println("Money transferred using Net banking: $"+amount);
    }
// debit card
    void transfer(int amount, String cardType) {
        System.out.println("Money transferred using " +cardType+":$ "+amount);
    }
// credit card with pin
    void transfer(int amount, String cardType, int pin) {
        System.out.println("Money transferred using " +cardType+"with pin: $ "+amount);
    }

    public static void main(String[] args) {
        Transaction t = new Transaction();
        t.transfer(2000);
        t.transfer(3000,"debit card");
        t.transfer(5000,"credit card",1234);
    }
}
