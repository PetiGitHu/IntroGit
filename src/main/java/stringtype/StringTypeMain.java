package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {

        boolean b;
        boolean c;

        String ax = "";
        String bx = "";


        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix + name;

        System.out.println(message+"444");

        message = message+"444";

        b = "Hello John Doe".equals(message);
        c = "Hello John Doe444".equals(message);

        System.out.println(b);
        System.out.println(c);

        System.out.println(ax+bx);
        System.out.println((ax+bx).length());

        System.out.println("Abcde".length());
        System.out.println("Abcde".charAt(1)+", "+"Abcde".charAt(3));
        System.out.println("Abcde".substring(0,4));

    }
}
