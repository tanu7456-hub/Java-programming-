// practical 2: to print the prime numbers between n1 to n2 uring class,objects and methods.
class PrimeNumbers {

    void printPrime(int n1, int n2) {
        for (int i = n1; i <= n2; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count == 2)
                System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        PrimeNumbers obj = new PrimeNumbers();
        obj.printPrime(10, 50);
    }
}
