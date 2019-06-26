package sample.controller;

import com.jfoenix.controls.JFXButton;
import com.mysql.cj.jdbc.JdbcPreparedStatement;
import com.sun.org.apache.xml.internal.security.Init;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import sample.helper.DBHandler;
import sample.model.Reservation;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;
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
    private TableView<Reservation> tableViewID;

    @FXML
    private TableColumn<Reservation, String> tablePurpose;

    @FXML
    private TableColumn<Reservation, LocalDate> tableDateSubmitted;

    @FXML
    private TableColumn<Reservation, LocalDate> tableDateRequested;

    @FXML
    private TableColumn<Reservation, String> tableStatus;

    static private DBHandler dbHandler;
    static private Connection connection;
    static private JdbcPreparedStatement preparedStatement;

    ObservableList<Reservation> reservations = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {


        String query = "SELECT * FROM reservations";


        try {
            ResultSet resultSet = connection.createStatement().executeQuery(query);

             DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            while(resultSet.next()) {
//            reservations.add(new Reservation(resultSet.getString("purpose"),
//                    LocalDate.parse(resultSet.getString("date_submitted")),
//                    LocalDate.parse(resultSet.getString("date_requested")),
//                    resultSet.getString("status")));
                reservations.add(new Reservation("purpose", LocalDate.of(2019, Month.JUNE, 16),
                  LocalDate.of(2019, Month.JUNE, 25), "Pending"));
                System.out.println(resultSet.getString("purpose"));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        tablePurpose.setCellValueFactory(new PropertyValueFactory<Reservation, String>("purpose"));
        tableDateSubmitted.setCellValueFactory(new PropertyValueFactory<Reservation, LocalDate>("dateSubmitted"));
        tableDateRequested.setCellValueFactory(new PropertyValueFactory<Reservation, LocalDate>("dateRequested"));
        tableStatus.setCellValueFactory(new PropertyValueFactory<Reservation, String>("status"));

        tableViewID.setItems(reservations);

        dashboardProfileImageID.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Clicked!");
            }
        });

    }

//    private ObservableList<Reservation> getReservation() throws SQLException {
//
//
//
//        ObservableList<Reservation> reservations = FXCollections.observableArrayList();
//        reservations.add(new Reservation("purpose", LocalDate.of(2019, Month.JUNE, 16),
//                LocalDate.of(2019, Month.JUNE, 25), "Pending"));
//        return reservations;
//
//    }


    void setName(String name) {
        dashboardNameID.setText(name);
    }


}
