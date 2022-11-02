import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        // Math.random(); this is static method,
        Scanner sc = new Scanner(System.in);
        System.out.println("enter month (1-12)");
         int monthNo = sc.nextInt(); // || means only 1 result come out of them but && shows more result
        // if (monthNo == 1 || monthNo==3 || monthNo==5 ||  monthNo==7 ||  monthNo==8 || monthNo==10 || monthNo== 12) {
        //  System.out.println("31 days");
        //}

        // else if (monthNo == 4 || monthNo==6 || monthNo== 9 || monthNo==11) {
        //   System.out.println("30 days");
        //}

        //else if (monthNo == 2) {
        //  System.out.println("28 days");

        //}

        //else  {
        //  System.out.println("invalid");

        //} //every "if" can replace with switch

       switch (monthNo) {

            case 1:
                case 2 :
                System.out.println("31 days");
                break;
            case 12:
                System.out.println("28 days");
                break;

            default:
                System.out.println("invalid");
                break;
        }
    }
}