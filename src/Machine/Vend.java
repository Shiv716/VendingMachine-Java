package Machine;

import java.util.ArrayList;
import java.util.HashMap;

public class Vend {
    
    // Enter a number
    // Check if the product exists with that code
    // If no , then ask the customer to re-verify it . Yes: Enter the correct code , No : Exit option
    // After selecting the product , ask for card details
    // Verify the details , if the format is correct , move on to verify with the bank .
    // If the details are correct : Make the payment and drop the product . IF NOT , ask to re-enter the details -
    // - at max two times and then exit the process (also give the option to exit manually) .
    //  Let's makeup a GUI for this for better usage.
    //After making a payment , a repository must contain the details for whole sale.
    // Put in the option in one window to change the products in different numbers.
    // Start the program with initial window by only those who know the password.
    // Create a space for storing everyone's passwords.
    // Put in warning labels and code accordingly in controller class to put in valid code and product


    //Hashmap for all the products:-
    public static HashMap<String,String> product_code = new HashMap<>();

    //ArrayList for all the available products:-
    public static ArrayList<String> product_list = new ArrayList<>();

    //Adding all the products in the arraylist:
    static {
        product_list.add("Kohinoor");
        product_list.add("Cotton Candy");
        product_list.add("Nescafe Gold");
        product_list.add("Kellog's");
        product_list.add("Creatine");
        product_list.add("Coop");
        product_list.add("Paneer");
        product_list.add("Soy Milk");
        product_list.add("J2O");
    }

    //This object will store the product code in accordance with serial number / Product Name:-
    public static void getProduct(String code , String product){
        product_code.put("P01","Coca-Cola");
        product_code.put("P02","Sprite");
        product_code.put("P03","Limca");
        product_code.put("P04","Diet Coke");
        product_code.put("P05","Fanta");
        product_code.put("P06","VitaPro");
        product_code.put("P07","Nescafe");
        product_code.put("P08","Espresso");
        product_code.put("P09","Mocha");
        product_code.put("P10","Latte");
        product_code.put("P11","Voss");
        product_code.put("P12","FruitSmash");
        product_code.put("P13","JD");
        product_code.put("P14","Smirnoff");
        product_code.put("P15","Bisleri");
        product_code.put("P16","Sparkling Water");
        product_code.put("P17","MyProtein");
        product_code.put("P18","Grenade");
        product_code.put("P19","DairyMilk");
        product_code.put("P20","M&M");
    }


    // This object will store the options for available products in each number so that can be used later:-
    public static void setProducts(String code , String product){

        //Verifying so that only available products are replaced:-
        if(product_list.contains(product)){
            //Here the product can be changed in the original hashmap;
            if(product!=null && code!=null){
                String backup_product = product_code.get(code);
                product_code.replace(backup_product,product); // Replacing the product.

                //To keep track of the replaced product:-
                //Condition to make sure not to duplicate the product inside the list:-
                if(!product_list.contains(backup_product)){
                    product_list.add(backup_product);
                }
            }
        }
    }


}
