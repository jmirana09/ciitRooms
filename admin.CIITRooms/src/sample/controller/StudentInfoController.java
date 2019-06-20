package sample.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StudentInfoController implements Initializable {

    @FXML
    private AnchorPane othersField;

    @FXML
    private Label adminNameLabel;

    @FXML
    private Label adminIDNumberLabel;

    @FXML
    private JFXButton adminLogOutButton;

    @FXML
    private JFXTextField nameField;

    @FXML
    private JFXTextField numberField;

    @FXML
    private JFXTextField purposeField;

    @FXML
    private JFXTextField descriptionField;

    @FXML
    private JFXTextField roomField;

    @FXML
    private JFXTextField dateField;

    @FXML
    private JFXTextField timeStartField;

    @FXML
    private JFXTextField timeEndField;

    @FXML
    private JFXCheckBox tvCheckBox;

    @FXML
    private JFXCheckBox micCheckBox1;

    @FXML
    private JFXCheckBox ltCheckBox2;

    @FXML
    private JFXCheckBox othersCheckBox3;

    @FXML
    private JFXCheckBox skCheckBox4;

    @FXML
    private JFXTextField dateField1;

    @FXML
    private JFXButton approveButton;

    @FXML
    private JFXButton declineButton;

    @FXML
    private JFXButton adminHistoryButton;

    @FXML
    private JFXButton backButton;


    @Override
    public void initialize(URL location, ResourceBundle resources) {


        // approve button
        approveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                approveButton.getScene().getWindow().hide();
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("/sample/view/dashboard.fxml"));
                try {
                    loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                Stage adminStage = new Stage();
                Parent root = loader.getRoot();
                adminStage.setTitle("Admin");
                adminStage.setScene(new Scene(root));
                adminStage.show();

            }
        });


        // decline button
        declineButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                declineButton.getScene().getWindow().hide();
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("/sample/view/dashboard.fxml"));
                try {
                    loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                Stage adminStage = new Stage();
                Parent root = loader.getRoot();
                adminStage.setTitle("Admin");
                adminStage.setScene(new Scene(root));
                adminStage.show();

            }
        });

        //log out button function
        adminLogOutButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                adminLogOutButton.getScene().getWindow().hide();
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("/sample/view/login.fxml"));
                try {
                    loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                Stage dashboardStage = new Stage();
                Parent root = loader.getRoot();
                dashboardStage.setTitle("Log In");
                dashboardStage.setScene(new Scene(root));
                dashboardStage.show();
                //dashboardStage.setResizable(false);
            }
        });

        //back button sa history
        backButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                backButton.getScene().getWindow().hide();
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

