package sample.controller;

import com.jfoenix.controls.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {


    @FXML
    private Label coordinatorLabelID;

    @FXML
    private JFXButton logoutButtonID;

    @FXML
    private ImageView coordinatorPicID;

    @FXML
    private JFXComboBox<String> comboBoxDayID;

    @FXML
    private JFXListView<String> schedListViewID;

    @FXML
    private JFXTextField purposeTxtFieldID;

    @FXML
    private JFXTimePicker timepickerID;

    @FXML
    private JFXTextArea descriptionTxtAreaID;

    @FXML
    private JFXButton updateButtonID;


    @FXML
    private Label roomLabelID;


    ObservableList<String> comboList = FXCollections.observableArrayList("Monday" , "Tuesday" , "Wednesday" , "Thursday" , "Friday" , "Saturday");

    ObservableList<String> listRoomViewList = FXCollections.observableArrayList("8:00 - 9:00","9:00 - 10:00","10:00 - 11:00","11:00 - 12:00","12:00 - 1:00","1:00 - 2:00"
            ,"2:00 - 3:00","3:00 - 4:00","4:00 - 5:00","5:00 - 6:00","6:00 - 7:00","7:00 - 8:00","8:00 - 9:00");

    @Override
    public void initialize(URL location, ResourceBundle resources) {

     comboBoxDayID.setItems(comboList);
    schedListViewID.setItems(listRoomViewList);
        logoutButtonID.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                logoutButtonID.getScene().getWindow().hide();
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("/sample/view/login.fxml"));
                try {
                    loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage loginStage = new Stage();
                Parent root = loader.getRoot();

                loginStage.setTitle("Student Login");
                loginStage.setScene(new Scene(root));
                loginStage.setResizable(false);
                loginStage.show();
            }
        });
    }
    void setName(String name) {
        roomLabelID.setText(name);

    }
}
