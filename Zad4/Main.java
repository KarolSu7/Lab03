import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj liczbe (> 0): ");
        int n = in.nextInt();
        if(n <= 0)
            System.out.println("Wpisano zla liczbe");
        else{
            boolean a[][] = new boolean[n][n];
            ArrayList<Integer> x = new ArrayList<Integer>();
            ArrayList<Integer> y = new ArrayList<Integer>();
            int xc;
            int yc;
            int f;

            for(int i = 0; i < n; i++){
                x.add(0);
            }

            for(int i = 0; i < n; i++){
                y.add(0);
            }

            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    xc = 0;
                    yc = 0;

                    for(int z = 0; z < n; z++){
                        x.set(z, 0);
                        y.set(z, 0);
                    }

                    System.out.print((i+1) + "." + (j+1) + "  ");
                    for(int wc = 2; wc <= n; wc++){
                        if((i+1) % wc == 0 && (i+1) != 1){
                            x.set(xc, wc);
                            System.out.print(x.get(xc) + " ");
                            xc++;
                        }
                    }

                    for(int wc = 2; wc <= n; wc++){
                        if((j+1) % wc == 0 && (j+1) != 1){
                            y.set(yc, wc);
                            System.out.print(y.get(yc) + " ");
                            yc++;
                        }
                    }
                    System.out.println();
                    f = 0;
                    for(int k = 0; k < x.size(); k++){
                        for(int l = 0; l < y.size(); l++){
                            if(x.get(k) == y.get(l) && x.get(k) > 1 && y.get(l) > 1)
                                f = 1;
                        }
                    }



                    if(f == 1)
                        a[i][j] = false;
                    else
                        a[i][j] = true;
                }
            }



            if(n >= 10)
                System.out.print("  ");
            else
                System.out.print(" ");

            for(int i = 0; i < n; i ++){
                System.out.print(" " + (i+1));
            }
            System.out.println("");

            for(int i = 0; i < n; i++){
                System.out.print((i+1));
                if(n >= 10 && i < 9)
                    System.out.print(" ");

                for(int j = 0; j < n; j++){
                    if(j >= 10){
                        if(a[i][j])
                            System.out.print(" + ");
                        else
                            System.out.print(" . ");
                    }
                    else{
                        if(a[i][j])
                            System.out.print(" +");
                        else
                            System.out.print(" .");
                    }
                }
                System.out.println("");
            }
        }
    }
}