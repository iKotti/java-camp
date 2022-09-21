public class RecapDemo2 {
    public static void main(String[] args) {
        double[] numbers = {1.2, 5.7, 8.2, 4.6};
        double total = 0;
        double max = numbers[0];

        for (double number : numbers) {
            if (max < number) {
                max = number;
                max = number;
            }
            total += number;
        }

        System.out.println("Toplam: " + total);
        System.out.println("En Büyük Sayı: " + max);
    }
}
