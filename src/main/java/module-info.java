module com.example.speedfast {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.speedfast to javafx.fxml;
    exports com.example.speedfast;
}