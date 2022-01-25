import java.util.Random;
public class ZadanieDwa {
    public static void main(String [] args){

    Random rand = new Random();
    int[][] tabInt = new int[5][5];

    int kMax = 0;
    int kMin = 0;
    int [] tabMax = new int[5];
    int [] tabMin = new int[5];

    for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){
            int a = rand.nextInt(11)-5;
            System.out.print(" "+String.valueOf(tabInt[i][j] = a)+" ");
        }
        System.out.print("\n");
    }

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                int s =tabInt[i][j];
                if(s>kMax){
                    kMax = s;
                }
                if(s<kMin){
                    kMin = s;
                }
            }
            //System.out.println("Max dla kolumny nr."+i+" wynosi: "+kMax);
            //System.out.println("Min dla kolumny nr."+i+" wynosi: "+kMin);
            tabMax[i]=kMax;
            tabMin[i]=kMin;
            kMax=0;
            kMin=0;
        }
        System.out.println("\n");
        System.out.println("Max w kolumnie:");
        for(int i=0;i<tabMax.length;i++){
            System.out.println(i+" : "+tabMax[i]);
        }
        System.out.println("Min w kolumnie:");
        for(int i=0;i<tabMin.length;i++){
            System.out.println(i+" : "+tabMin[i]);
        }


    }
}
