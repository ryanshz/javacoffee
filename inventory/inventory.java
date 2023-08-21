package inventory;
import java.util.Scanner;

public class inventory extends invMethods{
    /**
     * @throws InterruptedException allows Thread.sleep to function properly
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner sc=new Scanner(System.in); //switch statement scanner
        Scanner sellInput=new Scanner(System.in); //scanner for sell input
        Scanner buyInput=new Scanner(System.in); //scanner for buy input
        int run=999;
        while(run==999){ //main loop to run program
            displayStart();
            inventoryInitiate();
            String input=sc.nextLine();
            switch(input){ //prints main terminal and begins switch case for operation
                case "1": //purchase menu
                    System.out.println("\nNow running 'PURCHASE'\n");
                    Thread.sleep(500);
                    purchaseLoop:
                    while(run==999){ //prints purchase terminal and begins switch case for operation
                        Thread.sleep(1000);
                        purchaseStart();
                        input=sc.nextLine();
                        switch(input){
                            case "1": //prints inventory
                                inventoryPrint();
                                Thread.sleep(500);
                                break;
                            case "2":
                                inventoryPrint();
                                System.out.println("Input item from inventory that you wish to add to cart: ");
                                String itemIn=buyInput.nextLine();
                                addToCart(itemIn);
                                System.out.println("Returning to BUY menu.");
                                Thread.sleep(500);
                                break;
                            case "3":
                                break;
                            case "4":
                                break;
                            case "5":
                                break;
                            case "0": //returns to main menu
                                System.out.println("\nNow returning to main menu.\n");
                                Thread.sleep(500);
                                break purchaseLoop;
                            default: //if proper integer not given for input
                                System.out.println("\nERROR: Input a valid integer and try again.\n");
                        }
                    }
                    break;
                case "2": //sell menu
                    System.out.println("Now running 'Sell'");
                    Thread.sleep(500);
                    sellLoop:
                    while(run==999){ //prints sell terminal and begins switch case for operation
                        Thread.sleep(1000);
                        sellStart();
                        input=sc.nextLine();
                        switch(input){
                            case "1": //prints inventory, same as purchase option
                                inventoryPrint();
                                Thread.sleep(500);
                                break;
                            case "2": //sells item and adds it to inventory
                                System.out.println("Input item you wish to sell: ");
                                String itemIn=sellInput.nextLine();
                                sellItem(itemIn);
                                Thread.sleep(500);
                                break;
                            case "3":
                                break;
                            case "0": //returns to main menu
                                System.out.println("\nNow returning to main menu.\n");
                                Thread.sleep(500);
                                break sellLoop;
                            default: //if proper integer not given for input
                                System.out.println("\nERROR: Input a valid integer and try again.\n");
                        }
                    }
                    break;
                case "3": //other
                    System.out.println("Now running 'Other'");
                    break;
                case "4": //help menu, for debugging or commands that help user of system
                    System.out.println("Now running 'Help'");
                    Thread.sleep(500);
                    helpLoop:
                    while(run==999){
                        Thread.sleep(1000);
                        helpStart();
                        input=sc.nextLine();
                        switch(input){
                            case "1": //prints hash map of inventory items
                                printHashMap();
                                Thread.sleep(1000);
                                break;
                            case "0": //returns to main menu
                                System.out.println("\nNow returning to main menu.\n");
                                Thread.sleep(500);
                                break helpLoop;
                            default: //proper integer not given for input
                                System.out.println("\nERROR: Input a valid integer and try again.\n");
                        }
                    }
                    break;
                case "0": //exits program
                    System.out.println("Thank you! Have a nice day!");
                    return;
                default: //proper integer not given for input
                    System.out.println("\nERROR: Input a valid integer and try again.\n");
            }
        }
        sc.close();
        sellInput.close();
        buyInput.close();
    }
}