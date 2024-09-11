package classstructuremethods2;

import classstructuremethods2.Client;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client("Eger, Malomárok utca 2");

        client.setName("Kis Jolan");
        client.setBirthYear(1982);


        String name = client.getName();
        int birthdate = client.getBirthYear();
        String address = client.getAddress();

        System.out.println("Az ügyfél neve:" + name  + " - Születési éve:" + birthdate + " - Címe: " + address);

        client.migrate("Budapest, Deák Ferenc tér 1.");
        address = client.getAddress();

        System.out.println("Az ügyfél neve:" + name  + " - Születési éve:" + birthdate + " - Címe: " + address);

    }
}
