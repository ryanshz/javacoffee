package inventory;

import java.util.HashMap;

public class invMethods{
    static HashMap<Integer,String> storage=new HashMap<Integer,String>();

    public static void displayStart(){
        System.out.println("-----------WELCOME TO INVENTORY MANAGEMENT-----------\n");
        System.out.println("Input number for function you would like to access: ");
        System.out.println("    1. Purchase");
        System.out.println("    2. Sell");
        System.out.println("    3. Other");
        System.out.println("    4. Help");
        System.out.println("    0. Exit\n");
        System.out.println("-----------------------------------------------------");
    }

    public static void purchaseStart(){
        System.out.println("-----------WELCOME TO PURCHASE-----------\n");
        System.out.println("Input number for function you would like to access: ");
        System.out.println("    1. View Inventory");
        System.out.println("    2. Checkout");
        System.out.println("    3. Help");
        System.out.println("    0. Back\n");
        System.out.println("-----------------------------------------");
    }

    public static void inventoryInitiate(){
        storage.put(1,"The Great Gatsby");
        storage.put(2,"The Silmarillion");
        storage.put(3,"Farenheit 451");
    }

    public static void inventoryPrint(){
        System.out.println("Objects contained in inventory:\n");
        for(String x:storage.values()){
            System.out.println(x);
        }
        System.out.println();
    }
}
