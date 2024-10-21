package org.example.threadjavafx;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Rectangle;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Rectangle gaz_tank;

    @FXML
    private HBox box;



    @Override
    public void initialize(URL location, ResourceBundle resources) {

        Image car=new Image(Objects.requireNonNull(getClass().getResourceAsStream("car.png")));
        ImageView carImageView = new ImageView(car);
        System.out.println("branch simo");
        Button button = new Button("sds");
        box.getChildren().add(button);
        gaz_tank.setHeight(200.3);
    }
}