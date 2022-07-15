package Machine;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import Machine.Vend.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class VendingController {

    public DatePicker Date;
    public Slider slider;
    public Hyperlink Link;
    public javafx.scene.control.Label displayLabel;
    public TextArea List;
    public Label welcome;

    //Contains value from the slider:-
    public static int num;

    //Contains product:-
    public static String product;

    //Contains date to be used later:-
    public static LocalDate dateVar ;


    public void AddDate(ActionEvent actionEvent) {
        //Displaying first product on text.
         List.setText("Choose Product");
         welcome.setText("Welcome "+PasswordController.userkey+" !"); // Warm Welcome Text
        dateVar= Date.getValue(); // Storing date into var to be used later;
    }

    public void ChooseProduct(MouseEvent mouseEvent) {
        welcome.setText("Welcome "+PasswordController.userkey+" !"); // Warm Welcome Text

    }

    public void DisplayCode(MouseEvent mouseEvent) {
    }

    public void PaymentTransfer(ActionEvent actionEvent) throws IOException {
        //Getting product data:-
        int var = (int) slider.getValue();
        product = Vend.product_code.get(var); // Storing final product

        Parent encrypt_1 = FXMLLoader.load(getClass().getResource("Payment.fxml"));
        Scene encrypt = new Scene(encrypt_1);
        Stage app_stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        app_stage.hide();
        app_stage.setScene(encrypt);
        app_stage.show();
    }

    public void setButton(ActionEvent actionEvent) {
        welcome.setText("Welcome "+PasswordController.userkey+" !"); // Warm Welcome Text

        // Setting the code on the label as the slider is moved:-
        num = (int) slider.getValue();
        displayLabel.setText(String.valueOf(num));

        //Setting the product name on text-area.
        List.setText(Vend.product_code.get(num));
    }

    public void add(ActionEvent actionEvent) {
        //Making sure to higher limit by limit of product list.
        if(num<30){
        num = num+1;
            slider.setValue(num);
            displayLabel.setText(String.valueOf(num));

        //Setting the product name on text-area.
        List.setText(Vend.product_code.get(num));
        }
    }

    public void minus(ActionEvent actionEvent) {
        //Making sure to lower limit by 0.
        if(num>0){
        num = num-1;
            slider.setValue(num);
            displayLabel.setText(String.valueOf(num));

        //Setting the product name on text-area.
        List.setText(Vend.product_code.get(num));
        }
    }

}
