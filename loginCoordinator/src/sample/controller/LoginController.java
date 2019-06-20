package sample.controller;


import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private JFXTextField usernameTextFieldID;

    @FXML
    private JFXPasswordField passwordFieldID;

    @FXML
    private JFXButton loginButtonID;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loginButtonID.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                 if(!usernameTextFieldID.getText().trim().equals("") &&
                         !passwordFieldID.getText().trim().equals("")) {
                     loginUser();

                 }
            }

            private void loginUser() {

                loginButtonID.getScene().getWindow().hide();
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("/sample/view/roomsList.fxml"));
                try {
                    loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage roomsListStage = new Stage();
                Parent root = loader.getRoot();
                roomsListStage.setScene(new Scene(root));
                roomsListStage.setResizable(false);
                roomsListStage.show();
            }





        });
    }


}
