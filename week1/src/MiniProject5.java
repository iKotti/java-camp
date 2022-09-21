public class MiniProject5 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int search = 10;

        boolean isExist = false;

        for (int number : numbers) {
            if (number == search) {
                isExist = true;
                break;
            }
        }

        if (isExist)
            System.out.println(search + " sayısı mevcut.");
        else
            System.out.println(search + " sayısı mevcut değil");
    }
}
