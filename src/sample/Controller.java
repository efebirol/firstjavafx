package sample;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller implements Initializable {

    private Label label;
    private Label testLbl;

    //FXML Anno
    @FXML
    private Label lblOut;

    @FXML
    private CheckBox cboxIsHuman;

    @FXML
    public TextField textName;

    @FXML
    public Button testButton;


    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("Button wurde geklickt");
        label.setText("Hallo Birol");

        //count until a number
        counterForMe(10);
    }

    private void counterForMe(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(number + "\n");
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //ToDo
    }

    //On-Action-Event für den Button (siehe fx:id)
    public void isHumanTest(javafx.event.ActionEvent actionEvent) {
        if (cboxIsHuman.isSelected()) {
            lblOut.setText("Button geklickt (MIT Hacken in der Checkbox)");
        }
        if (!cboxIsHuman.isSelected()) {
            lblOut.setText("Button geklickt (OHNE Hacken in der Checkbox)");
        }
    }
}
