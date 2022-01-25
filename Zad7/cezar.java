import java.util.Scanner;

public class cezar {
    public static void main(String [] args){
        String slowo;
        int klucz;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz słowo: ");
        slowo = scanner.next();
        System.out.println(slowo+" <-- Twoje slowo");
        System.out.println("Wpisz klucz: ");
        klucz = scanner.nextInt();
        System.out.println(klucz+" <-- Twoj klucz");

        char[] a = slowo.toCharArray();
        for(int i=0; i < a.length; i++){
            int n = a[i];
            n += klucz;
            a[i] = (char)n;
        }
        System.out.println(new String(a)+" <-- szyfr cezara");
    }
}
