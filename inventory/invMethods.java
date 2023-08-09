package inventory;

import java.util.HashMap;

public class invMethods{
    public static void displayStart(){
        System.out.println("-----------WELCOME TO INVENTORY MANAGEMENT-----------");
        System.out.println();
        System.out.println("Input number for function you would like to access: ");
        System.out.println("    1. Purchase");
        System.out.println("    2. Sell");
        System.out.println("    3. Other");
        System.out.println("    4. Help");
        System.out.println("    0. Exit");
        System.out.println();
        System.out.println("-----------------------------------------------------");
    }

    public static void purchaseStart(){
        System.out.println("-----------WELCOME TO PURCHASE-----------");
        System.out.println();
        System.out.println("Input number for function you would like to access: ");
        System.out.println("    1. View Inventory");
        System.out.println("    2. Checkout");
        System.out.println("    3. Help");
        System.out.println("    0. Back");
        System.out.println();
        System.out.println("-----------------------------------------");
    }
}
