package inventory;
import java.util.HashMap;

public class invMethods{
    /**
     * storage hashmap holds all items in inventory
     */
    static HashMap<Integer,String> storage=new HashMap<Integer,String>();
    static HashMap<Integer,String> cart=new HashMap<Integer,String>();
    /**
     * prints start screen for program
     */
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

    /**
     * prints screen for purchase menu
     */
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

    /**
     * prints screen for sell menu
     */
    public static void sellStart(){
        System.out.println("-----------WELCOME TO SELL-----------\n");
        System.out.println("Input number for function you would like to access: ");
        System.out.println("    1. View Inventory");
        System.out.println("    2. Sell Items");
        System.out.println("    3. Help");
        System.out.println("    0. Back\n");
        System.out.println("-------------------------------------");
    }

    /**
     * prints screen for help menu
     */
    public static void helpStart(){ 
        System.out.println("-----------WELCOME TO HELP-----------\n");
        System.out.println("Input number for function you would like to access: ");
        System.out.println("    1. Print HashMap");
        System.out.println("    0. Back\n");
        System.out.println("-------------------------------------");
    }

    /**
     * initiates inventory in both buy and sell menu
     */
    public static void inventoryInitiate(){
        storage.put(1,"The Great Gatsby");
        storage.put(2,"The Silmarillion");
        storage.put(3,"Farenheit 451");
        storage.put(4,"Fellowship of the Ring");
        storage.put(5,"Brave New World");
        storage.put(6,"A Wrinkle in Time");
    }

    /**
     * sells item and adds it to hashmap as next key item and next string in
     * @param itemIn String value to be added as an item to storage inventory
     */
    public static void sellItem(String itemIn){
        storage.put(storage.size()+1,itemIn);
    }

    /**
     * prints String values in hashmap
     */
    public static void inventoryPrint(){
        System.out.println("Objects contained in inventory:\n");
        for(String x:storage.values()){
            System.out.println(x);
        }
        System.out.println();
    }

    /**
     * prints whole hashmap
     */
    public static void printHashMap(){
        System.out.println("Inventory Hashmap:\n");
        for(Integer x:storage.keySet()){
            System.out.println("Key: "+x+" Item: "+storage.get(x));
        }
    }
    /**
     * adds object listed to new 'cart' hashmap
     */
    public static void addToCart(String itemIn){
        cart.put(cart.size()+1,itemIn);
        System.out.println(cart.get(1)+" ("+cart.size()+") was added.\n");
    }
    /**
     * prints cart
     */
    public static void printCart(){
        System.out.println("Items in Cart:\n");
        for(String x: cart.values()){
            System.out.println(x);
        }
        System.out.println();
    }
    /**
     * removes item from cart
     */
    public static void removeFromCart(String itemIn){
        if(cart.containsValue(itemIn)){
            cart.values().remove(itemIn);
            System.out.println("Item removed.");
        }else{
            System.out.println("Item is not in cart.");
        }
    }

    /**
     * checks out cart, removing it from inventory
     */
    public static void checkoutCart(){
        
    }
}
