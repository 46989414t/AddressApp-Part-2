package ch.makery.address.view;

import ch.makery.address.MainApp;
import ch.makery.address.model.Parametres;
import ch.makery.address.model.Person;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * Created by 46989414t on 20/11/15.
 */
public class ParametresOverviewController {
    @FXML
    private TableView<Parametres> parametresTable;
    @FXML
    private TableColumn<Parametres, String> ciudadColumn;
    @FXML
    private TableColumn<Person, String> unidadNameColumn;
    private TableColumn<Person, Integer> diasColumn;

    @FXML
    private Label maximasLabel;
    @FXML
    private Label minimasLabel;
    @FXML
    private Label diaLabel;
    /*@FXML
    private Label postalCodeLabel;
    @FXML
    private Label cityLabel;
    @FXML
    private Label birthdayLabel;*/

    // Reference to the main application.
    private MainApp mainApp;

    /**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public ParametresOverviewController() {
    }

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
        // Initialize the person table with the two columns.
        ciudadColumn.setCellValueFactory(cellData -> cellData.getValue().unidadProperty());
        unidadNameColumn.setCellValueFactory(cellData -> cellData.getValue().cityProperty());
        //diasColumn.setCellValueFactory(cellData -> cellData.getValue().lastNameProperty());
    }

    /**
     * Is called by the main application to give a reference back to itself.
     *
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;

        // Add observable list data to the table
        personTable.setItems(mainApp.getPersonData());
    }

}
