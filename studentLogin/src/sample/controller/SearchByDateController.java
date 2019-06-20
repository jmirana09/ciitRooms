package sample.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
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
import java.time.LocalDate;
import java.util.ResourceBundle;

public class SearchByDateController implements Initializable {


    @FXML
    private JFXDatePicker pickDatePickerID;

    @FXML
    private JFXButton nextButtonID;

    @FXML
    private JFXButton backButonIdD;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        pickDatePickerID.setEditable(false);


        nextButtonID.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                nextButtonID.getScene().getWindow().hide();
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("/sample/view/searchByRoom.fxml"));
                try {
                    loader.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Stage searchByRoomStage = new Stage();
                Parent root = loader.getRoot();
                searchByRoomStage.setTitle("Student Login");
                searchByRoomStage.setScene(new Scene(root));
                searchByRoomStage.setResizable(false);
                searchByRoomStage.show();

            }
        });


        backButonIdD.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                backButonIdD.getScene().getWindow().hide();
                FXMLLoader loaderDateThree = new FXMLLoader();
                loaderDateThree.setLocation(getClass().getResource("/sample/view/dashboard.fxml"));
                try {
                    loaderDateThree.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                Stage searchByDateThreeStage = new Stage();
                Parent root = loaderDateThree.getRoot();
                searchByDateThreeStage.setTitle("");
                searchByDateThreeStage.setScene(new Scene(root));
                searchByDateThreeStage.setResizable(false);
                searchByDateThreeStage.show();
            }
        });

    }

}
