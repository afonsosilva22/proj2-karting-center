package com.example.desktop.controllers;

import com.example.desktop.models.Customer;
import com.example.desktop.services.CustomerService;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class AddCustomerController {

    @FXML private TextField nameField;
    @FXML private TextField nifField;
    @FXML private TextField emailField;
    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML private DatePicker birthdatePicker;

    private final CustomerService customerService = new CustomerService();

    @FXML
    private void saveCustomer() {
        try {
            Customer customer = new Customer();

            customer.setName(nameField.getText());
            customer.setNif(nifField.getText());
            customer.setEmail(emailField.getText());
            customer.setUsername(usernameField.getText());
            customer.setPassword(passwordField.getText());

            customer.setBirthDate(birthdatePicker.getValue().toString());

            customer.setIsMember(false);
            customer.setNumViolations(0);
            customer.setRegistrationDate("2020-03-12");
            customer.setStatus("active");

            Customer created = customerService.create(customer);

            System.out.println("Customer created: " + created.getName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}