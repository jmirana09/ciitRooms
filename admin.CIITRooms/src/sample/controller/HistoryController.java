package sample.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import com.sun.org.apache.xml.internal.security.Init;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HistoryController implements Initializable {

    @FXML
    private ImageView adminImage;

    @FXML
    private Label adminNameLabel;

    @FXML
    private JFXButton adminLogOutButton;

    @FXML
    private JFXListView<String> adminListView;

    @FXML
    private JFXButton historyBackButton;

    @FXML
    private Label adminIDNumberLabel;

    @FXML
    private ImageView adminHistoryImage;


    @Override
    public void initialize (URL location, ResourceBundle resources) {

        //back button sa history
        historyBackButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                historyBackButton.getScene().getWindow().hide();
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
                dashboardStage.setTitle("Admin");
                dashboardStage.setScene(new Scene(root));
                dashboardStage.show();
                //dashboardStage.setResizable(false);
            }
        });
    }
}
