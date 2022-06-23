package Machine;

import java.util.ArrayList;
import java.util.HashMap;

//Stores the password by the users:-
public class PasswordKeeper {

    public static HashMap<String,String> password_list = new HashMap<>();

    static {
        password_list.put("Shivang","password");
        password_list.put("Singhania","sureshot");
        password_list.put("Priti","babe");
        password_list.put("Coby","player");
    }
}
