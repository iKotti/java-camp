public class miniProject2 {
    public static void main(String[] args) {
        char character = 'C';

        switch (character) {
            case 'A':
            case 'E':
            case 'I':
            case 'İ':
            case 'O':
            case 'Ö':
            case 'U':
            case 'Ü':
                System.out.println("Sesli harf: " + character);
                break;
            default:
                System.out.println("Sessiz harf: " + character);
        }
    }
}
