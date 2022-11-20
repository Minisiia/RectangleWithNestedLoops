import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть довжину a");
        int a = scanner.nextInt();
        System.out.println("Введіть ширину b");
        int b = scanner.nextInt();
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}
