import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adja meg a felhasználó nevét:");
        String a = scanner.nextLine();

        System.out.println("Adja meg a felhasználó nevét:");
        String b = scanner.nextLine();

        System.out.println("A személy adatai:" + a + " " + b);
    }

}
