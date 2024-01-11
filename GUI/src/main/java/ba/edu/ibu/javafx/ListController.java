package ba.edu.ibu.javafx;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import java.net.URL;
import javafx.scene.control.TextField;
import org.controlsfx.control.textfield.TextFields;

import java.util.*;
import java.sql.*;

public class ListController implements Initializable {
    @FXML
    public TextField txtId;
    @FXML
    public TextField txtName;
    @FXML
    public TextField txtSurname;
    @FXML
    public TextField txtYear;
    @FXML
    public TextField txtCycle;
    @FXML
    public TableView tblStudents;
    @FXML
    public TableColumn<Student, Integer> colId;
    @FXML
    public TableColumn<Student, String> colName;
    @FXML
    public TableColumn<Student, String> colSurname;
    @FXML
    public TableColumn<Student, String> colCycle;
    @FXML
    public TableColumn<Student, String> colYear;
    @FXML
    public Button btnSave;
    @FXML
    public TextField input;
    ResultSet rs;

    List<Student> students = new ArrayList<>();


    int selectedIndex;

    static void showError(String title, String message) {
        Locale.setDefault(Locale.ENGLISH);
        Alert error = new Alert(Alert.AlertType.ERROR);
        error.setTitle(title);
        error.setHeaderText(message);
        error.show();
    }

    @FXML
    void getStudent(MouseEvent event) {
        selectedIndex = tblStudents.getSelectionModel().getSelectedIndex();
        if (selectedIndex <= -1) return;

        txtId.setText(colId.getCellData(selectedIndex).toString());
        txtName.setText(colName.getCellData(selectedIndex));
        txtSurname.setText(colSurname.getCellData(selectedIndex));
        txtYear.setText(colYear.getCellData(selectedIndex));
        txtCycle.setText(colCycle.getCellData(selectedIndex));
    }

    @FXML
    void saveStudent() {
        try {

            int newId = Integer.parseInt(txtId.getText());
            String name = txtName.getText();
            String surname = txtSurname.getText();
            String year = txtYear.getText();
            String cycle = txtCycle.getText();
            if(name == null || year == null || surname == null || cycle == null){
                showError("Empty field" , "You must fill all column");
            }
            Student tempStudent = new Student(newId, name, surname, year, cycle);

            if (DBConnection.isDublicate(newId)) {
                DBConnection.setValue(tempStudent);
            } else {
                DBConnection.insertValue(tempStudent);
            }
            reinitializeTable();
        } catch (NumberFormatException e) {
            showError("Invalid attribute", "You have to populate all fields");
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initializeTable();
        reinitializeTable();
        String[] word = DBConnection.strings().split(" ");
        TextFields.bindAutoCompletion(input, word);
    }

    public void initializeTable() {
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colSurname.setCellValueFactory(new PropertyValueFactory<>("surname"));
        colYear.setCellValueFactory(new PropertyValueFactory<>("year"));
        colCycle.setCellValueFactory(new PropertyValueFactory<>("cycle"));
    }

    public void reinitializeTable() {
        try {
            students.clear();

            rs = DBConnection.getAll();
            while (rs.next()) {
                Student tmpStudent = new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("surname"),
                        rs.getString("year"),
                        rs.getString("cycle")
                );
                students.add(tmpStudent);
            }
            tblStudents.setItems(FXCollections.observableArrayList(students));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
