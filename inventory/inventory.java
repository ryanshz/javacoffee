package inventory;
import java.util.Scanner;

public class inventory extends invMethods{
    public static void main(String[] args) throws InterruptedException {
        Scanner sc=new Scanner(System.in);
        int run=999;
        while(run==999){
            displayStart();
            inventoryInitiate();
            String input=sc.nextLine();
            switch(input){
                case "1":
                    System.out.println("\nNow running 'PURCHASE'\n");
                    Thread.sleep(500);
                    purchaseLoop:
                    while(run==999){
                        Thread.sleep(1000);
                        purchaseStart();
                        input=sc.nextLine();
                        switch(input){
                            case "1":
                                inventoryPrint();
                                Thread.sleep(500);
                                break;
                            case "2":
                                break;
                            case "3":
                                break;
                            case "4":
                                break;
                            case "5":
                                break;
                            case "0":
                                System.out.println("\nNow returning to main menu.\n");
                                Thread.sleep(500);
                                break purchaseLoop;
                            default:
                                System.out.println("\nERROR: Input a valid integer and try again.\n");
                        }
                    }
                    break;
                case "2":
                    System.out.println("Now running 'Sell'");
                    Thread.sleep(500);
                    sellLoop:
                    while(run==999){
                        Thread.sleep(1000);
                        sellStart();
                        input=sc.nextLine();
                        switch(input){
                            case "1":
                                inventoryPrint();
                                Thread.sleep(500);
                                break;
                            case "2":
                                break;
                            case "3":
                                break;
                            case "0":
                                System.out.println("\nNow returning to main menu.\n");
                                Thread.sleep(500);
                                break sellLoop;
                            default:
                                System.out.println("\nERROR: Input a valid integer and try again.\n");
                        }
                    }
                    break;
                case "3":
                    System.out.println("Now running 'Other'");
                    break;
                case "4":
                    System.out.println("Now running 'Help'");
                    break;
                case "0":
                    System.out.println("Thank you! Have a nice day!");
                    return;
                default:
                    System.out.println("\nERROR: Input a valid integer and try again.\n");
            }
        }
        sc.close();
    }
}