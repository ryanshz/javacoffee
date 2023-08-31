package inventory;
import java.util.Scanner;

public class inventory extends invMethods{
    /**
     * @throws InterruptedException allows Thread.sleep to function properly
     */
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); //switch statement scanner
        Scanner sellInput=new Scanner(System.in); //scanner for sell input
        Scanner buyInput=new Scanner(System.in); //scanner for buy input
        int run=999;
        while(run==999){ //main loop to run program
            purchaseFile();
            displayStart();
            inventoryInitiate();
            String input=sc.nextLine();
            switch(input){ //prints main terminal and begins switch case for operation
                case "1": //purchase menu
                    System.out.println("\nNow running 'PURCHASE'\n");
                    purchaseLoop:
                    while(run==999){ //prints purchase terminal and begins switch case for operation
                        purchaseStart();
                        input=sc.nextLine();
                        switch(input){
                            case "1": //prints inventory
                                inventoryPrint();
                                break;
                            case "2": //prints inventory, adds item to cart
                                inventoryPrint();
                                System.out.println("Input item from inventory that you wish to add to cart: ");
                                String itemIn=buyInput.nextLine();
                                addToCart(itemIn);
                                System.out.println("Returning to BUY menu.");
                                break;
                            case "3": //prints cart, removes item from cart
                                printCart();
                                System.out.println("Input item from inventory you wish to remove from cart: ");
                                itemIn=buyInput.nextLine();
                                removeFromCart(itemIn);
                                System.out.println("Returning to BUY menu.");
                                break;
                            case "4": //checks out cart and removes from inventory
                                printCart();
                                System.out.println("Are these the items you'd like to check out? (Y/N)");
                                itemIn=buyInput.nextLine();
                                System.out.println(itemIn);
                                switch(itemIn){
                                    case "N":
                                        System.out.println("Returning to BUY menu.");
                                        break;
                                    case "Y":
                                        addPurchase(1);
                                        checkoutCart();
                                        System.out.println("Thank you, have a nice day!");
                                        break;
                                    default:
                                        System.out.println("ERROR: Invalid input, returning to BUY menu.");
                                }
                                break;
                            case "0": //returns to main menu
                                System.out.println("\nNow returning to main menu.\n");
                                break purchaseLoop;
                            default: //if proper integer not given for input
                                System.out.println("\nERROR: Input a valid integer and try again.\n");
                        }
                    }
                    break;
                case "2": //sell menu
                    System.out.println("Now running 'Sell'");
                    sellLoop:
                    while(run==999){ //prints sell terminal and begins switch case for operation
                        sellStart();
                        input=sc.nextLine();
                        switch(input){
                            case "1": //prints inventory, same as purchase option
                                inventoryPrint();
                                break;
                            case "2": //sells item and adds it to inventory
                                System.out.println("Input item you wish to sell: ");
                                String itemIn=sellInput.nextLine();
                                sellItem(itemIn);
                                break;
                            case "0": //returns to main menu
                                System.out.println("\nNow returning to main menu.\n");
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
                    helpLoop:
                    while(run==999){
                        helpStart();
                        input=sc.nextLine();
                        switch(input){
                            case "1": //prints hash map of inventory items
                                printStorageHashMap();
                                break;
                            case "2": //inventory counter
                                System.out.println("Creating inventory report: ");
                                inventoryFile();
                                writeToInvFile();
                                break;
                            case "3": //purchase log
                                System.out.println("Creating purchase report: ");
                                writeToPurchase();
                                break;
                            case "0": //returns to main menu
                                System.out.println("\nNow returning to main menu.\n");
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