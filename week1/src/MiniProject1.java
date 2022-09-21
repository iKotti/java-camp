public class MiniProject1 {
    public static void main(String[] args) {
        int number = 13;
        boolean isPrime = true;

        if (number == 1 || number < 0) {
            System.out.println("Geçersiz sayı: " + number);
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println(number + " asal sayıdır.");

        else
            System.out.println(number + " asal sayı değildir.");
    }
}
