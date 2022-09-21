public class RecapDemo1 {
    public static void main(String[] args) {
        int number1 = 30;
        int number2 = 40;
        int number3 = 5;

        int max = number1;

        if (max < number2)
            max = number2;


        if (max < number3)
            max = number3;

        System.out.println("En büyük: " + max);

    }
}
