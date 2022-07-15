package Machine;

import java.util.ArrayList;
import java.util.HashMap;

public class Vend {

    //Final LOOKOUT:-
    /*
    First window : loads second one only through correct password
    Second Window : Choose the product and move on to third.
    Third Window : Enter Card Details and validate
    Fourth Window : Print receipt
     */

    //Hashmap for all the products:-
    public static HashMap<Integer,String> product_code = new HashMap<>();


    //This block will store the product code in accordance with serial number / Product Name:-
    static{
        product_code.put(0,"Coca-Cola $2.50");
        product_code.put(1,"Sprite $2.00");
        product_code.put(2,"Limca $1.70");
        product_code.put(3,"Diet Coke $2.00");
        product_code.put(4,"Fanta $2.70");
        product_code.put(5,"VitaPro $4.00");
        product_code.put(6,"Nescafe $3.40");
        product_code.put(7,"Espresso $1.90");
        product_code.put(8,"Mocha $2.40");
        product_code.put(9,"Latte $1.30");
        product_code.put(10,"Voss $3.00");
        product_code.put(11,"FruitSmash $2.90");
        product_code.put(12,"JD $6.00");
        product_code.put(13,"Smirnoff $4.00");
        product_code.put(14,"Bisleri $3.00");
        product_code.put(15,"Sparkling Water $2.70");
        product_code.put(16,"MyProtein $8.00");
        product_code.put(17,"Grenade $5.60");
        product_code.put(18,"DairyMilk $4.20");
        product_code.put(19,"Kohinoor $3.50");
        product_code.put(20,"Cotton Candy $2.30");
        product_code.put(21,"M&M $4.30");
        product_code.put(22,"Nescafe Gold $1.23");
        product_code.put(23,"Kellog's $3.40");
        product_code.put(24,"Creatine $6.70");
        product_code.put(25,"Coop $7.00");
        product_code.put(26,"Paneer $11.00");
        product_code.put(27,"Soy Milk $10.90");
        product_code.put(28,"Coop prime $2.30 ");
        product_code.put(29,"J2O $4.50");
        product_code.put(30,"Apple $5.00");
    }

}
