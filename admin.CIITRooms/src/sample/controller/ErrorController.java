package sample.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ErrorController implements Initializable{
    @FXML
    private JFXButton errorOkButton;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        errorOkButton.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent event) {
                Stage errorStage = (Stage) errorOkButton.getScene().getWindow();
                errorStage.close();
                }

        });
    }

}