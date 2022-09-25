import java.util.Scanner;
import static java.lang.Math.*;

public class power {
    public static void main(String[] args){
        int n;
        Scanner obj= new Scanner(System.in);
        n= obj.nextInt();
        System.out.print("n^1");
        System.out.print(" ");
        System.out.print("n^2");
        System.out.print(" ");
        System.out.print("n^3");
        System.out.print(" ");
        System.out.print("n^4");
        System.out.print(" ");

        int i=1;
        while(i<=n){
            print_powers(i);
            i=i+1;
        }

    }
    public static void print_powers(int n){
        int i=0;
        while(i<=4){
            int a= (int) pow(n,i);
            System.out.print(a);
            System.out.print(" ");
            i=i+1;
        }
        System.out.println("");
    }
}
