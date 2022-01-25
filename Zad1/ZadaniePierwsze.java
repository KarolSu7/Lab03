import org.w3c.dom.html.HTMLBaseElement;

import java.util.Random;

public class ZadaniePierwsze {
    public static void main(String [] args){
        Random rand = new Random();
        int tabInt[] = new int[10];
        int max = 0;
        int min = 0;
        int mniejsze = 0;
        int wieksze = 0;
        float sr = 0;

        for(int i = 0;i<10;i++){
            int a = rand.nextInt(21)-10;
            tabInt[i]= a;
            if(a>max){
                max = a;
            }
            if(a<min){
                min = a;
            }
            System.out.println(tabInt[i]);
            sr = sr + tabInt[i];
        }

        sr = sr/ tabInt.length;
        System.out.println("Srednia: "+sr);
        System.out.println("Max: "+max+"\n"+"Min: "+min);

        for(int i= 0; i< tabInt.length;i++){
            if(tabInt[i] < sr) mniejsze++;
            if(tabInt[i] > sr) wieksze++;
        }
        System.out.println("\n");
        System.out.println("Ilosc liczb mniejszych od sredniej: "+mniejsze);
        System.out.println("Ilosc liczb wiekszych od sredniej: "+wieksze);
        System.out.println("\n");
        System.out.println("Tablica odwrocona: ");

        for(int i= 9; i> 0;i--){
            System.out.println(tabInt[i]);
        }
    }
}
