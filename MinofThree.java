  class MinOfThree{
    public static void main (String[] args){
       int a=7;
       int b=5;
       int c=10;
       int d;
       d= smallest(a,b,c);
       System.out.println(d);
    }
    public static int smallest(int a, int b,int c){
        if(a<=b&&a<=c){
            return a;
        }else if (b<=c){
            return b;
        }else{
            return c;
        }
    }
}