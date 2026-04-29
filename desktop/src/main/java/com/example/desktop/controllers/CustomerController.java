package com.example.desktop.controllers;

import com.example.desktop.models.Customer;
import com.example.desktop.services.CustomerService;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerController {

    @FXML
    private TableView<Customer> table;

    @FXML
    private TableColumn<Customer, Integer> colId;

    @FXML
    private TableColumn<Customer, String> colName;

    @FXML
    private TableColumn<Customer, String> colEmail;

    @FXML
    private TableColumn<Customer, String> colPhone;

    @FXML
    private TableColumn<Customer, String> colStatus;

    private final CustomerService service = new CustomerService();

    @FXML
    public void initialize() {

        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colPhone.setCellValueFactory(new PropertyValueFactory<>("phone"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));
    }

    @FXML
    public void loadCustomers() {

        try {
            table.setItems(
                    FXCollections.observableArrayList(
                            service.getAllCustomers()
                    )
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void addCustomer() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/desktop/add-customer.fxml"));
            Parent root = loader.load();

            Stage stage = new Stage();
            stage.setTitle("Add Customer");
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}