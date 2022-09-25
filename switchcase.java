public class switchcase {
    public static void main(String[] args){
        int month=13;
        switch(month){
            case 1:
                    System.out.println("january 31");
                    break;
            case 2:
                System.out.println("february 28 and 29 days in leap year");
                break;
            case 3:
                System.out.println("march 31");
                break;

            case 4:
                System.out.println("April 30");
                break;
            case 5:
                System.out.println("may 31");
                break;
            case 6:
                System.out.println("june 30");
                break;
            case 7:
                System.out.println("july 31");
                break;
            case 8:
                System.out.println("August 31");
                break;
            case 9:
                System.out.println("September 30");
                break;
            case 10:
                System.out.println("October 31");
                break;
            case 11:
                System.out.println("November 30");
                break;
            case 12:
                System.out.println("December 31");
                break;
            default:
                System.out.println("Not a Valid month");
        }
    }
}
