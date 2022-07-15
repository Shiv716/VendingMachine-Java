package Machine;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;

public class PasswordController {
    public PasswordField pass;
    public Label verify;
    public Button GoButton;

    public static String userkey;
    public int value = 0;

    public void passField(ActionEvent actionEvent ) {
    }

    public void goButton(ActionEvent actionEvent) throws IOException {
        
        //Validating the number of attempts to enter the password:-
        if(value==0){
            verify.setText("Incorrect Password!");
        }
        if(value==1){
            pass.isDisable();
            verify.setText("2 Attempts left..");
            GoButton.isCancelButton();
        }
        if(value==2){
            pass.isDisable();
            verify.setText("1 Attempt left..");
            GoButton.isCancelButton();
        }
        if(value==3){
            verify.setText("Your attempts are over!");
            GoButton.setDisable(true);
            pass.setDisable(true);
        }
        else{
            value++;
            //Verifying password:-
            if(PasswordKeeper.password_list.containsValue(pass.getText())){
                //Storing user's name to be used later:-
                String [] keySet = PasswordKeeper.password_list.keySet().toArray(new String[0]);
               String [] valueSet = PasswordKeeper.password_list.values().toArray(new String[0]);
               int var = 0 ;
               for(int i =0 ;i < valueSet.length;i++){
                   if(pass.getText().equals(valueSet[i])){
                       var = i;
                   }
               }
               userkey = keySet[var];

               System.out.println(pass.getText());

               //loads next window
                Parent encrypt_1 = FXMLLoader.load(getClass().getResource("VendingMachine.fxml"));
                Scene encrypt = new Scene(encrypt_1);
                Stage app_stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
                app_stage.hide();
                app_stage.setScene(encrypt);
                app_stage.show();
            }
        }

        System.out.println("Checking username: "+userkey); // for check.
    }

}
