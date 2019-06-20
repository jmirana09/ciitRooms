package sample.controller;

import com.jfoenix.controls.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class SearchByDateTwoController implements Initializable {
    @FXML
    private JFXComboBox<String> roomComboID;

    @FXML
    private ImageView userPictureID;

    @FXML
    private Label userLabelID;

    @FXML
    private Label studentNumberLabelID;

    @FXML
    private JFXButton logoutButtonID;

    @FXML
    private JFXTimePicker startTimeID;

    @FXML
    private JFXListView<String> schedListVIewID;

    @FXML
    private JFXTextField titleTextFieldID;

    @FXML
    private JFXTextField purposeTextFieldID;

    @FXML
    private JFXTextArea descriptionTextAreaID;

    @FXML
    private JFXCheckBox tvCheckBoxID;

    @FXML
    private JFXCheckBox micCheckBoxID;

    @FXML
    private JFXCheckBox speakersCheckBoxID;

    @FXML
    private JFXCheckBox othersCheckBoxID;

    @FXML
    private JFXCheckBox laptopCheckBoxID;

    @FXML
    private JFXTextField othersTextFieldID;

    @FXML
    private JFXButton submitButtonID;

    @FXML
    private JFXTimePicker endTimeID;

    @FXML
    private Label availTimeLabelID;

    @FXML
    private Label dateLabelID;

    ObservableList<String> comboList = FXCollections.observableArrayList("Recording Room","Studio Room","Glasshouse","Room 401","Room 402","Room 403","Room 501","Room 502"
            ,"Room 503","Room 504","Room 505","Room 506","Room 601","Room 602","Room 603","Room 604","Room 605","Room 606","Room 701");


    ObservableList<String> listViewList = FXCollections.observableArrayList("8:00 - 9:00","9:00 - 10:00","10:00 - 11:00","11:00 - 12:00","12:00 - 1:00","1:00 - 2:00"
            ,"2:00 - 3:00","3:00 - 4:00","4:00 - 5:00","5:00 - 6:00","6:00 - 7:00","7:00 - 8:00","8:00 - 9:00");
    @Override
    public void initialize(URL location, ResourceBundle resources) {


        roomComboID.setItems(comboList);
        schedListVIewID.setItems(listViewList);



        othersTextFieldID.setDisable(true);
    othersCheckBoxID.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            if( othersCheckBoxID.isSelected() ){
                othersTextFieldID.setDisable(false);

            }

            else{
                othersTextFieldID.setText("");
                othersTextFieldID.setDisable(true);
            }
        }
    });



    }
}
