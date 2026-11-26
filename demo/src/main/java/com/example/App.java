package com.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    private int count = 0;

    @Override
    public void start(Stage stage) {
        Label label = new Label("Clicks: 0");
        Button button = new Button("Click Me");

        button.setOnAction(e -> {
            count++;
            label.setText("Clicks: " + count);
        });

        VBox root = new VBox(12, label, button);
        root.setAlignment(Pos.CENTER);

        stage.setScene(new Scene(root, 300, 180));
        stage.setTitle("Quick Counter");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}