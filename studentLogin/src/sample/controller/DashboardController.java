package sample.controller;

import com.jfoenix.controls.JFXButton;
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
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {
    @FXML
    private ImageView dashboardProfileImageID;

    @FXML
    private Label dashboardNameID;

    @FXML
    private Label dashboardStudentNumberID;

    @FXML
    private JFXButton logoutBtnID;

    @FXML
    private JFXButton searchRoomBtnID;

    @FXML
    private JFXButton reservationBtnID;

    @FXML
    private JFXButton dashboardBtnID;

    @FXML
    private Label searchByLabelID;

    @FXML
    private Button dateButtonID;

    @FXML
    private Label roomLabelID;

    @FXML
    private Label dateLabelID;

    @FXML
    private Button roomButtonID;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        searchByLabelID.setVisible(false);
        dateLabelID.setVisible(false);
        roomLabelID.setVisible(false);
        dateButtonID.setVisible(false);
        roomButtonID.setVisible(false);



        dashboardBtnID.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                searchByLabelID.setVisible(false);
                dateLabelID.setVisible(false);
                roomLabelID.setVisible(false);
                dateButtonID.setVisible(false);
                roomButtonID.setVisible(false);

            }
        });

        reservationBtnID.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                searchByLabelID.setVisible(false);
                dateLabelID.setVisible(false);
                roomLabelID.setVisible(false);
                dateButtonID.setVisible(false);
                roomButtonID.setVisible(false);

            }
        });


        searchRoomBtnID.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                dateLabelID.setVisible(true);
                roomLabelID.setVisible(true);
                dateButtonID.setVisible(true);
                roomButtonID.setVisible(true);
                searchByLabelID.setVisible(true);


            }
        });

        roomButtonID.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {


                roomButtonID.getScene().getWindow().hide();
                FXMLLoader loaderRoom = new FXMLLoader();
                loaderRoom.setLocation(getClass().getResource("/sample/view/searchByRoom.fxml"));
                try {
                    loaderRoom.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage searchByRoomStage = new Stage();
                Parent root =loaderRoom.getRoot();

                searchByRoomStage.setTitle("Student Login");
                searchByRoomStage.setScene(new Scene(root));
                searchByRoomStage.setResizable(false);
                searchByRoomStage.show();

            }

        });


        dateButtonID.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                dateButtonID.getScene().getWindow().hide();
                FXMLLoader loaderDate = new FXMLLoader();
                loaderDate.setLocation(getClass().getResource("/sample/view/searchByDate.fxml"));
                try {
                    loaderDate.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage searchByDateStage = new Stage();
                Parent root = loaderDate.getRoot();

                searchByDateStage.setTitle("Student Login");
                searchByDateStage.setScene(new Scene(root));
                searchByDateStage.setResizable(false);
                searchByDateStage.show();
            }
        });
        logoutBtnID.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                logoutBtnID.getScene().getWindow().hide();
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("/sample/view/loginStudent.fxml"));
                try {
                    loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage loginStudentStage = new Stage();
                Parent root = loader.getRoot();

                loginStudentStage.setTitle("Student Login");
                loginStudentStage.setScene(new Scene(root));
                loginStudentStage.setResizable(false);
                loginStudentStage.show();
            }
        });
    }

}
