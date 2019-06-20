package sample.controller;


import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXListView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.security.PublicKey;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {

    @FXML
    private ImageView adminImage;

    @FXML
    private Label adminNameLabel;

    @FXML
    private JFXButton adminLogOutButton;

    @FXML
    private JFXListView<String> adminListView;

    @FXML
    private JFXButton adminHistoryButton;

    @FXML
    private Label adminIDNumberLabel;

    @FXML
    private ImageView adminListImage;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //log out button function
        adminLogOutButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Stage logoutStage = (Stage) adminLogOutButton.getScene().getWindow();
                logoutStage.close();
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


        // clickable image view to More Info Window
        adminListImage.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                moreInfo();
            }

            private void moreInfo() {
                adminListView.getScene().getWindow().hide();
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("/sample/view/studentInfo.fxml"));
                try {
                    loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                Stage studentInfo = new Stage();
                Parent root = loader.getRoot();
                studentInfo.setTitle("More Information");
                studentInfo.setScene(new Scene(root));
                studentInfo.show();
                //studentInfo.setResizable(false);
            }
        });



        // button to open history window
        adminHistoryButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                fullHistory();
            }

            private void fullHistory() {
                adminListView.getScene().getWindow().hide();
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("/sample/view/history.fxml"));
                try {
                    loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                Stage historyStage = new Stage();
                Parent root = loader.getRoot();
                historyStage.setTitle("History");
                historyStage.setScene(new Scene(root));
                historyStage.show();
                //historyStage.setResizable(false);
            }
        });

    }
}
