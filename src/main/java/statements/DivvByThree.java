package statements;

import java.util.Scanner;

public class DivvByThree {
    public static void main(String[] args) {
        int a;
        System.out.println("Adjon meg egy számot:");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        if(a%3 == 0)
            System.out.println("A szám osztható 3-val");
        else
            System.out.println("A szám nem osztható 3-val");
    }
}
