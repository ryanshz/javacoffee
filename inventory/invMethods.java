package inventory;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class invMethods{
    /**
     * storage hashmap holds all items in inventory
     */
    static HashMap<Integer,String> storage=new HashMap<Integer,String>();
    static HashMap<Integer,String> cart=new HashMap<Integer,String>();
    static HashMap<Integer,String> purchaseLogBuy=new HashMap<Integer,String>();
    static HashMap<Integer,String> purchaseLogSell=new HashMap<Integer,String>();
    /**
     * prints start screen for program
     */
    public static void displayStart(){
        System.out.println("-----------WELCOME TO INVENTORY MANAGEMENT-----------\n");
        System.out.println("Input number for function you would like to access: ");
        System.out.println("    1. Purchase");
        System.out.println("    2. Sell");
        System.out.println("    3. Help");
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
        System.out.println("    2. Print Inventory Report");
        System.out.println("    3. Print Purchase Report");
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
     * @return 
     */
    public static void printStorageHashMap(){
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
        System.out.println("Inventory:");
        for(Integer x:storage.keySet()){
            System.out.println("Key: "+x+" Item: "+storage.get(x));
        }
        System.out.println();
        System.out.println("Cart:");
        for(Integer x:cart.keySet()){
            System.out.println("Key: "+x+" Item: "+cart.get(x));
        }
        System.out.println("Removing overlap...");
        for(int i=0;i<storage.size();i++){
            String invItem=storage.get(i);
            if(cart.containsValue(invItem)){
                storage.remove(i);
                System.out.println(invItem+" removed from inventory.");
            }
        }
        System.out.println("Checkout complete.\n");
    }

    /**
     * creates inventory log
     */
    public static void inventoryFile(){
        try{
            File invFile=new File("inventoryreport.txt");
            if(invFile.createNewFile()){
                System.out.println("Inventory report created: "+invFile.getName());
            }else{
                System.out.println("Inventory report exists.");
            }
        }catch(IOException e){
            System.out.println("ERROR occurred.");
        }
    }

    /**
     * writes inventory to inventory catalog
     */
    public static void writeToInvFile(){
        try{
            FileWriter invFileWrite=new FileWriter("inventoryreport.txt");
            invFileWrite.write("Current Inventory: \n");
            for(Integer x:storage.keySet()){
                invFileWrite.write("Key: "+x+" Item: "+storage.get(x)+"\n");
            }
            invFileWrite.close();
            System.out.println("Inventory report printed.");
        }catch(IOException e){
            System.out.println("ERROR occurred.");
        }
    }

    /**
     * creates purchase log
     */
    public static void purchaseFile(){
        try{
            File purchaseFile=new File("purchasereport.txt");
            if(purchaseFile.createNewFile()){
                System.out.println("Purchase report created: "+purchaseFile.getName()+"\n");
            }else{
                System.out.println("Purchase report exists."+"\n");
            }
        }catch(IOException e){
            System.out.println("ERROR occurred.");
        }
    }

    /**
     * adds item to purchase array to use later for log
     * @param purchaseID acts as identifier to see if purchase logged is a buy or sell
     */
    public static void addPurchase(int purchaseID){
        if(purchaseID==1){
            for(Integer x:cart.keySet()){
                purchaseLogBuy.put(x,cart.get(x));
            }
        }else{
            purchaseLogSell.put(purchaseLogSell.size()+1,storage.get(storage.size()));
        }
    }

    /**
     * adds items to purchase log
     * @param purchaseID acts as identifier to see if purchase logged is a buy or sell
     */
    public static void writeToPurchase(){
        try{
            FileWriter purchaseFileWrite=new FileWriter("purchasereport.txt");
            purchaseFileWrite.write("Item(s) purchased:\n");
            for(Integer x:purchaseLogBuy.keySet()){ //buy
                purchaseFileWrite.write("Key: "+x+" Item: "+purchaseLogBuy.get(x)+"\n");
            }
            purchaseFileWrite.write("Item(s) sold:\n");
            for(Integer x:purchaseLogSell.keySet()){ //sell
                purchaseFileWrite.write("Key: "+x+" Item: "+purchaseLogSell.get(x)+"\n");
            }
            purchaseFileWrite.close();
            System.out.println("Added to report.");
        }catch(IOException e){
            System.out.println("ERROR occurred.");
        }
    }
}
