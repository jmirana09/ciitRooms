package sample.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SearchByRoomController implements Initializable {

    @FXML
    private JFXButton room701ButtonID;

    @FXML
    private JFXButton room606ButtonID;

    @FXML
    private JFXButton room605ButtonID;

    @FXML
    private JFXButton room604ButtonID;

    @FXML
    private JFXButton room603ButtonID;

    @FXML
    private JFXButton room602ButtonID;

    @FXML
    private JFXButton room601ButtonID;

    @FXML
    private JFXButton room506ButtonID;

    @FXML
    private JFXButton room505ButtonID;

    @FXML
    private JFXButton room504ButtonID;

    @FXML
    private JFXButton room503ButtonID;

    @FXML
    private JFXButton room502ButtonID;

    @FXML
    private JFXButton room501ButtonID;

    @FXML
    private JFXButton room403ButtonID;

    @FXML
    private JFXButton room402ButtonID;

    @FXML
    private JFXButton room401ButtonID;

    @FXML
    private JFXButton roomGlassHouseButtonID;

    @FXML
    private JFXButton roomRecordingRoomButtonID;

    @FXML
    private JFXButton roomStudioRoomButtonID;




    @FXML
    private JFXButton roomBackButtonID;



    @Override
    public void initialize(URL location, ResourceBundle resources) {

        roomBackButtonID.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                roomBackButtonID.getScene().getWindow().hide();
                FXMLLoader loaderBackRoom = new FXMLLoader();
                loaderBackRoom.setLocation(getClass().getResource("/sample/view/dashboard.fxml"));
                try {
                    loaderBackRoom.load();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                Stage searchByRoomStage = new Stage();

                Parent root = loaderBackRoom.getRoot();
                searchByRoomStage.setTitle("Student Login");
                searchByRoomStage.setScene(new Scene(root));
                searchByRoomStage.setResizable(false);
                searchByRoomStage.show();
            }
        });




    }



    public void buttonPressed(ActionEvent event) {
        Button button = (Button) event.getSource();
        button.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("/sample/view/searchByRoomTwo.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Stage searchByRoomTwoStage = new Stage();
        Parent root = loader.getRoot();
        searchByRoomTwoStage.setScene(new Scene(root));

        SearchByRoomTwoController searchByRoomController = loader.getController();
        searchByRoomController.setName(button.getText());


        searchByRoomTwoStage.show();
        searchByRoomTwoStage.setResizable(false);
    }




}
