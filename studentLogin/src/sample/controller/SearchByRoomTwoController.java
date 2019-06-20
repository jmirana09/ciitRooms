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
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SearchByRoomTwoController implements Initializable {

    @FXML
    private ImageView imageRoomButtonID;

    @FXML
    private Label userRoomLabelID;

    @FXML
    private Label numberRoomLabelID;

    @FXML
    private JFXButton logoutRoomButtonID;

    @FXML
    private JFXDatePicker datePickerRoomID;

    @FXML
    private JFXTimePicker timePickerStartRoomID;

    @FXML
    private JFXTimePicker timePickerEndRoomID;

    @FXML
    private JFXListView<String> listViewRoomID;

    @FXML
    private JFXTextField titleRoomTextFieldID;

    @FXML
    private JFXTextArea descriptionRoomTextAreaID;

    @FXML
    private JFXTextField purposeRoomTextFieldID;

    @FXML
    private JFXCheckBox tvCheckboxRoomID;

    @FXML
    private JFXCheckBox micCheckboxRoomID;

    @FXML
    private JFXCheckBox speakersCheckboxRoomID;

    @FXML
    private JFXCheckBox laptopCheckboxRoomID;

    @FXML
    private JFXCheckBox othersCheckboxRoomID;

    @FXML
    private JFXTextField othersTextFieldRoomID;

    @FXML
    private Label roomNumberLabelID;




    ObservableList<String> listRoomViewList = FXCollections.observableArrayList("8:00 - 9:00","9:00 - 10:00","10:00 - 11:00","11:00 - 12:00","12:00 - 1:00","1:00 - 2:00"
            ,"2:00 - 3:00","3:00 - 4:00","4:00 - 5:00","5:00 - 6:00","6:00 - 7:00","7:00 - 8:00","8:00 - 9:00");






    @Override
    public void initialize(URL location, ResourceBundle resources) {

        listViewRoomID.setItems(listRoomViewList);

        othersTextFieldRoomID.setDisable(true);


        othersCheckboxRoomID.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if( othersCheckboxRoomID.isSelected() ){
                    othersTextFieldRoomID.setDisable(false);

                }

                else{
                    othersTextFieldRoomID.setText("");
                    othersTextFieldRoomID.setDisable(true);
                }
            }
        });

        logoutRoomButtonID.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                logoutRoomButtonID.getScene().getWindow().hide();
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

    void setName(String name) {
        roomNumberLabelID.setText(name);

    }

}
