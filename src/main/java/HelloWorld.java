import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        //két egész szám bekérése
        System.out.println("Kéren adja meg az 1. számot:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println("Kéren adja meg a 2. számot:");
        int b = scanner.nextInt();



        System.out.println("Összege: " + (a+b));
        System.out.println("A két érték szorzata: " + (a*b));
    }
}
