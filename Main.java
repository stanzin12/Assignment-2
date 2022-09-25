import java.util.Scanner;

public class Main {
    public static void main(String[] args){
         double a;
         Scanner obj= new Scanner(System.in);
         a=obj.nextDouble();
         if(80 <=a && a<=90){
             a=a+5;
         }
        System.out.println(a);
    }

}

