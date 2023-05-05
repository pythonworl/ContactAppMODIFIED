module com.example.contactappmodified {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.contactappmodified to javafx.fxml;
    exports com.example.contactappmodified;
}