public class ArraysDemo {
    public static void main(String[] args) {
        String student1 = "İlker";
        String student2 = "Ziya";
        String student3 = "Cihat";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("---------------------");

        String[] students = new String[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println("---------------------");

        for (String student : students) {
            System.out.println(student);
        }
    }
}
