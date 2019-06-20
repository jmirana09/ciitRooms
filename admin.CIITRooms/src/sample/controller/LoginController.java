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

public class LoginController implements Initializable{
    @FXML
    private JFXTextField userTextFieldID;

    @FXML
    private JFXPasswordField passTextFieldID;

    @FXML
    private JFXButton logInButtonID;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        logInButtonID.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // lahat ng click sa log in button
                if (!userTextFieldID.getText().toString().trim().equals("") &&
                        !passTextFieldID.getText().toString().trim().equals("")) {
                    loginUser();

                }


                else {
                    errorDisplay();

                }

            }


            private void errorDisplay() {

                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("/sample/view/error.fxml"));
                try {
                    loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                Stage errorStage = new Stage();
                Parent root = loader.getRoot();
                errorStage.setTitle("Error");
                errorStage.setScene(new Scene(root));
                errorStage.show();
                errorStage.setResizable(false);




            }

            private void loginUser() {

                logInButtonID.getScene().getWindow().hide();
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("/sample/view/dashboard.fxml"));
                try {
                    loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                Stage dashboardStage = new Stage();
                Parent root = loader.getRoot();
                dashboardStage.setTitle("Admin");
                dashboardStage.setScene(new Scene(root));
                dashboardStage.show();
                //dashboardStage.setResizable(false);

            }



        });
    }

}
