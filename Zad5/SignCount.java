import java.util.Scanner;

public class SignCount {
    public static void main(String [] args){
        String slowo;
        int licznik = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz słowo: ");
        slowo = scanner.next();
        System.out.println(slowo+" <-- Twoje slowo");


        char lastValue = slowo.charAt(slowo.length()-1);
        for(int i = 0;i < slowo.length();i++) {
            char actualValue = slowo.charAt(i);
            if(actualValue == lastValue){
               licznik++;
            }
        }
        System.out.println("znaku: "+lastValue+" w słowie jest: "+licznik);
        }
    }

