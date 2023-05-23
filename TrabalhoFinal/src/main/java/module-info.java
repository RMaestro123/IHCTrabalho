module com.example.trabalhofinal {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.trabalhofinal to javafx.fxml;
    exports com.example.trabalhofinal;
}