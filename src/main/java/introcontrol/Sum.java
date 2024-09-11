package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Mennyi számot akarsz vizsgálni (2 -nél többet addhatsz meg)");
        int ix = scanner.nextInt();

        if(ix > 1){

        int sum = 0;

        for(int i=0; i<ix; i++){
            System.out.println("Kérem adja meg az "+(i+1)+" számot:");
            int a = scanner.nextInt();
            sum += a;
        }

        System.out.println("Az összegük:" + sum);

        }
        else {
            System.out.println("Nem 2-nél több számot adtál meg!");
        }
    }
}
