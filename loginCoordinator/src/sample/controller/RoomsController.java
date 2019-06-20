package sample.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RoomsController implements Initializable {
    @FXML
    private JFXButton room701ID;

    @FXML
    private JFXButton room606ID;

    @FXML
    private JFXButton room506ID;

    @FXML
    private JFXButton room605ID;

    @FXML
    private JFXButton room505ID;

    @FXML
    private JFXButton room604ID;

    @FXML
    private JFXButton room603ID;

    @FXML
    private JFXButton room602ID;

    @FXML
    private JFXButton room601ID;

    @FXML
    private JFXButton room502ID;

    @FXML
    private JFXButton room504ID;

    @FXML
    private JFXButton room503ID;

    @FXML
    private JFXButton room501ID;

    @FXML
    private JFXButton room403ID;

    @FXML
    private JFXButton room402ID;

    @FXML
    private JFXButton room401ID;

    @FXML
    private JFXButton RecordingRoomID;

    @FXML
    private JFXButton StudioRoomID;

    @FXML
    private JFXButton GlasshouseID;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


    public void buttonPressed(ActionEvent event) {
        Button button = (Button) event.getSource();
        button.getScene().getWindow().hide();
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("/sample/view/dashboard.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Stage dashboardStage = new Stage();
        Parent root = loader.getRoot();
        dashboardStage.setScene(new Scene(root));

        DashboardController dashboardController = loader.getController();
        dashboardController.setName(button.getText());


        dashboardStage.show();
        dashboardStage.setResizable(false);

    }

}
