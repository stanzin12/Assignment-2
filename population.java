public class population {

    public static void main(String[] args){
        int a=80000;
       int c=0;
       int year=0;
        while( a<=150000){
            a=a*105;
            a=a/100;
            System.out.println(a);
            year++;

        }
        System.out.println(year);
    }
}
