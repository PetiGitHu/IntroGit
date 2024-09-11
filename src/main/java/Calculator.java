import java.util.Scanner;

public class Calculator {
        public static void main(String[] args) {
        System.out.println("Kéren adja meg az 1. számot:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println("Kéren adja meg a 2. számot:");
        int b = scanner.nextInt();



        System.out.println("A két érték összege: " + (a+b));
        System.out.println("A két érték szorzata: " + (a*b));
    }
}
