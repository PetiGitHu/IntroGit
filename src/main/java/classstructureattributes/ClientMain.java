package classstructureattributes;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Client name:");
        String name = scanner.nextLine();
        System.out.println("Birth date:");
        int birthdate = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Address:");
        String address = scanner.nextLine();

        Client client = new Client();
        client.name= name;
        client.birthdate= birthdate;
        client.address= address;

        System.out.println("Név: " + name + " Születési dátum: " + birthdate + " Címe:" + address);
    }

}

