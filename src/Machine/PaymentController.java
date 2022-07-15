package Machine;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class PaymentController {

    public TextField date;
    public TextField month;
    public TextField year;
    public TextField cardName;
    public TextField cardNum;
    public Label warning;
    public Button receipt;
    public RadioButton card1;
    public RadioButton card2;

    //Storing data in variables to be used later:-
    public static String name;


    //Validating details:-
    public void chooseDate(ActionEvent actionEvent) {
    }

    public void chooseMonth(ActionEvent actionEvent) {
    }

    public void chooseYear(ActionEvent actionEvent) {
    }

    public void CardName(ActionEvent actionEvent) {
    }

    public void cardNumber(ActionEvent actionEvent) {
    }

    public void warnLabel(MouseEvent mouseEvent) {
    }

    public void printReceipt(ActionEvent actionEvent) throws IOException {

            Parent encrypt_1 = FXMLLoader.load(getClass().getResource("receipt.fxml"));
            Scene encrypt = new Scene(encrypt_1);
            Stage app_stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            app_stage.hide();
            app_stage.setScene(encrypt);
            app_stage.show();

    }

    //Making sure only one radio button can be selected:-
    public void master(ActionEvent actionEvent) {
        card2.setSelected(false);
    }

    public void visa(ActionEvent actionEvent) {
        card1.setSelected(false);
    }

    //validating everything:-
    public void transaction(ActionEvent actionEvent) {
        //Storing data
        if(!warning.getText().equals("Invalid Details!") && !warning.getText().equals("Choose card type!")){
            name = cardName.getText();
        }

        //For date:-
            if (date.getLength() > 2) {
                warning.setText("Invalid Details!");
            }


        //For month
        if (month.getLength() > 2) {
            warning.setText("Invalid Details!");
        }


        //For year
        if (year.getLength() > 4) {
            warning.setText("Invalid Details!");
        }


        //For Card Name
        if(cardName.getText().equals(" ")){
            warning.setText("Invalid Details!");
        }

        //For Card Number
        if(cardNum.getLength()<16 || cardNum.getLength()>16) {
            warning.setText("Invalid Details!");

        }

        //For card Type:-
        if(!card1.isSelected() && !card2.isSelected()){
            warning.setText("Choose card type!");
        }

        //Making receipt available if all details are correct:-
        if(!warning.getText().equals("Invalid Details!") && !warning.getText().equals("Choose card type!")){
            receipt.setDisable(false);
        }
    }

    public void Retry(ActionEvent actionEvent) {
        if(!warning.getText().equals(" ")){
            date.clear();
            month.clear();
            year.clear();
            cardName.clear();
            cardNum.clear();
            warning.setText(" ");
        }
    }
}
