public class LoopDemo {
    public static void main(String[] args) {

        // For
        for (int i = 2; i < 10; i += 2) {
            System.out.println(i);
        }

        System.out.println("For döngüsü tamamlandı.");

        // While
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i += 2;
        }

        System.out.println("While döngüsü tamamlandı.");
    }
}
