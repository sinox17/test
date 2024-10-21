package org.example.threadjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        System.out.println("sir lkdlk");


        System.out.println("test2");

        System.out.println("hello world");
        System.out.println("sir b7alk");

        System.out.println("brsnch simo ");

        System.out.println("branch simo");

        System.out.println("branch Dev2");
        System.out.println("branch Dev2");
        launch();
    }
}