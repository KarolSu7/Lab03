import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        int[] a=new int[32];
        int b = 0;
        int d= 0;
        int c=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe dziestetna do konwersij:");
        int b1 = scanner.nextInt();

        if(b1<0){
            d=1;
            b=b1*-1;
        } else{
            b=b1;
        }

        for(int i=0;b>0;i++){
            a[i]=b%2;
            b/=2;
            c++;
        }

        System.out.println("Wynik:");
        System.out.print(b1+" "+d+".");

        for(int j=c-1;j>=0;j--){
            System.out.print(a[j]);
        }
    }
}