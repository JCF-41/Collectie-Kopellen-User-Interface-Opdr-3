/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client.GUI;

import Client.Domain.Player;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;

/**
 *
 * @author Matthijs
 */
public class HeroControl {

    private int health;
    private ProgressBar pHealth;
    private Label lHealt;
    private Player player;

    public HeroControl(int health, Player player) {
        this.health = health;
        this.player = player;
    }

    public AnchorPane getHeroControl() {
        ImageView img = new ImageView("/Client/Images/I" + player.getIconId() + ".png");

        img.setFitWidth(225 - 80);
        img.setFitHeight(225 - 80);
        img.setX(40);
        img.setY(10);

        Font font = new Font("Calibri", 22.0);

        Label lName = new Label();
        lName.setText(player.getUsername());
        lName.setLayoutY(225 - 75);
        lName.setLayoutX(0);
        lName.setPrefWidth(225);
        lName.setAlignment(Pos.CENTER);
        lName.setFont(font);

        lHealt = new Label();
        lHealt.setText("60");
        lHealt.setLayoutY(225 - 50);
        lHealt.setLayoutX(10);
        lHealt.setFont(font);

        pHealth = new ProgressBar(0.6);
        pHealth.setLayoutX(50);
        pHealth.setLayoutY(255 - 60);
        pHealth.setPrefWidth(255 - 90);
        pHealth.setStyle("-fx-accent: red;");

        setHealth(50);

        AnchorPane root = new AnchorPane();
        root.getChildren().addAll(img, lName, lHealt, pHealth);
        return root;
    }

    public void setHealth(int health) {
        Platform.runLater(() -> {
            pHealth.setProgress(health / 50.0);
            lHealt.setText(health + "");
        });
    }
}
