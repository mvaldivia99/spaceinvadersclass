package com.example.spaceinvadersclass;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class GameController {
    @FXML
    Button startButton;

    @FXML
    protected void startGame(){
        System.out.println("button clicked");
    }
}
