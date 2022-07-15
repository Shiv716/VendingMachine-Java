package Machine;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ReceiptClass{
    public Label date;
    public Label name;
    public Label product;
    public Button button;

//Will print the important details on receipt:-
    public void getData(ActionEvent actionEvent) {
        date.setText(String.valueOf(VendingController.dateVar));
        name.setText(PaymentController.name);
        product.setText(VendingController.product);
    }
}
