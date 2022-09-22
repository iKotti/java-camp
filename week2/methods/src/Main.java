public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
    }

    public static void sayiBulmaca() {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int search = 10;

        boolean isExist = false;

        for (int number : numbers) {
            if (number == search) {
                isExist = true;
                break;
            }
        }

        String message = "";
        if (isExist) {
            message = search + " sayısı mevcut.";
            mesajVer(message);
        } else {
            message = search + " sayısı mevcut değil";
            mesajVer(message);
        }
    }

    public static void mesajVer(String message) {
        System.out.println(message);
    }
}
