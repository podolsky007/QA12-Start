module telran.org.qa12start {
    requires javafx.controls;
    requires javafx.fxml;


    opens telran.org.qa12start to javafx.fxml;
    exports telran.org.qa12start;
}