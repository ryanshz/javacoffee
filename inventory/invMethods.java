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
        System.out.println("    2. Add to Cart");
        System.out.println("    3. Remove from Cart");
        System.out.println("    4. Checkout");
        System.out.println("    5. Help");
        System.out.println("    0. Back\n");
        System.out.println("-----------------------------------------");
    }

    public static void sellStart(){
        System.out.println("-----------WELCOME TO SELL-----------\n");
        System.out.println("Input number for function you would like to access: ");
        System.out.println("    1. View Inventory");
        System.out.println("    2. Sell Items");
        System.out.println("    3. Help");
        System.out.println("    0. Back\n");
        System.out.println("-------------------------------------");
    }

    public static void helpStart(){
        System.out.println("-----------WELCOME TO HELP-----------\n");
        System.out.println("Input number for function you would like to access: ");
        System.out.println("    1. Print HashMap");
        System.out.println("    0. Back\n");
        System.out.println("-------------------------------------");
    }

    public static void inventoryInitiate(){
        storage.put(1,"The Great Gatsby");
        storage.put(2,"The Silmarillion");
        storage.put(3,"Farenheit 451");
        storage.put(4,"Fellowship of the Ring");
        storage.put(5,"Brave New World");
        storage.put(6,"A Wrinkle in Time");
    }

    public static void sellItem(String itemIn){
        storage.put(storage.size()+1,itemIn);
    }

    public static void inventoryPrint(){
        System.out.println("Objects contained in inventory:\n");
        for(String x:storage.values()){
            System.out.println(x);
        }
        System.out.println();
    }

    public static void printHashMap(){
        System.out.println("Inventory Hashmap:\n");
        for(Integer x:storage.keySet()){
            System.out.println("Key: "+x+" Item: "+storage.get(x));
        }
    }
}
