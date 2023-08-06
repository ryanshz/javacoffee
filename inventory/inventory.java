package inventory;
import java.util.Scanner;

public class inventory extends invMethods{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int run=999;
        while(run==999){
            displayStart();
            int input=sc.nextInt();
            switch(input){
                case 1:
                    System.out.println("1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Please input an integer value.");
                    input=sc.nextInt();
            }
        }
        sc.close();
    }
}