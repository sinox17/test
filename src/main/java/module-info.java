module org.example.threadjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.threadjavafx to javafx.fxml;
    exports org.example.threadjavafx;
}