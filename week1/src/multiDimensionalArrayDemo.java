public class multiDimensionalArrayDemo {
    public static void main(String[] args) {
        String[][] cities = new String[3][3];

        cities[0][0] = "Ankara";
        cities[0][1] = "İstanbul";
        cities[0][2] = "İzmir";
        cities[1][0] = "Adana";
        cities[1][1] = "Kırşehir";
        cities[1][2] = "Tokat";
        cities[2][0] = "Mersin";
        cities[2][1] = "Eskişehir";
        cities[2][2] = "Mardin";

        for (int i = 0; i <= 2; i++) {
            System.out.println("----------------");
            for (int j = 0; j <= 2; j++) {
                System.out.println(cities[i][j]);
            }
        }
    }

}
