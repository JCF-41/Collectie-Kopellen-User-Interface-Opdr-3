/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client.GUI;

import Client.Controller.SoundController;
import Shared.Domain.Icon;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.geometry.HPos;
import Client.Domain.Player;
import java.util.ArrayList;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javax.swing.JOptionPane;
import Client.Run.MightyDuelsClient;

/**
 * FXML Controller class
 *
 * @author Stan
 */
public class AccountFXMLController implements Initializable {

    private Stage stage;
    private Parent root;
    private Player loggedInPlayer;
    private static int selectedIcon = 1;

    @FXML
    private Label lblAccountName;

    @FXML
    private Label lblAmountOfGames;

    @FXML
    private Label lblAmountOfWins;

    @FXML
    private Label lblAmountOfLosses;

    @FXML
    private Label lblTheRating;

    @FXML
    private GridPane gpIcons;

    @FXML
    private Button btnSaveIcon;

    @FXML
    private Button btnBack;

    @FXML
    private ImageView ivSelectedIcon;

    private ArrayList<Icon> icons = new ArrayList<>();
    

    @FXML
    private void btnSaveIcon_OnClick(ActionEvent event) throws IOException {
        SoundController.play(SoundController.SoundFile.BUTTONPRESS);
        
        // Set the selected icon into the database.
        PlayerIconController.changePlayerIcon(loggedInPlayer.getId(), selectedIcon);
        Image image = new Image("/Client/Images/I" + selectedIcon + ".png", 120, 120, false, false);
        ivSelectedIcon.setImage(image);
        MightyDuelsServer.loggedInPlayer.setIconId(selectedIcon);
        //JOptionPane.showMessageDialog(null, "You have succesfully changed your icon to Icon number: " + selectedIcon + ".", "Icon saved", JOptionPane.INFORMATION_MESSAGE);
    }

    @FXML
    private void btnBack_OnClick(ActionEvent event) throws IOException {
        SoundController.play(SoundController.SoundFile.BUTTONPRESS);
        
        String title = "Mighty Duels";
        stage = (Stage) btnBack.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("MainScreenFXML.fxml"));
        MightyDuelsClient.navigate(stage, root, title);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.loggedInPlayer = MightyDuelsServer.loggedInPlayer;
        lblAccountName.setText(" " + loggedInPlayer.getUsername());
        lblTheRating.setText(" " + loggedInPlayer.getRating());
        lblAmountOfGames.setText(" " + loggedInPlayer.getMatches());
        lblAmountOfWins.setText(" " + loggedInPlayer.getWins());
        lblAmountOfLosses.setText(" " + loggedInPlayer.getLosses());

        Image imageSI = new Image("/Client/Images/I" + loggedInPlayer.getIconId()+ ".png", 120, 120, false, false);
        ivSelectedIcon.setImage(imageSI);

        // Load all the Icons from the Database. Set them into a list.
        icons = PlayerIconController.getIcons(loggedInPlayer.getRating());

        final ToggleGroup tg = new ToggleGroup();
        int l = 1; // ID
        int i = 0; // Collomn
        int j = 0; // Row
        for (Icon icon : icons) {
            // Icon Image
            Image image = new Image(icon.getFileName() + ".png", 180, 180, false, false);
            ImageView ivIcon = new ImageView(image);
            ivIcon.setId("" + l);
            ivIcon.setOnMouseClicked((javafx.scene.input.MouseEvent event) -> {
                ImageView iv = (ImageView) event.getSource();
                if (AccountFXMLController.selectedIcon != Integer.parseInt(iv.getId())) {
                    JOptionPane.showMessageDialog(null, "You have selected Icon number: " + iv.getId() + ".", "Icon selected", JOptionPane.INFORMATION_MESSAGE);
                }
                AccountFXMLController.setSelectedIcon(Integer.parseInt(iv.getId()));
            });
            gpIcons.setHalignment(ivIcon, HPos.CENTER);
            gpIcons.add(ivIcon, i, j);

            i++;
            l++;

            if (i == 4) {
                j++;
                i = 0;
            }
        }
    }

    public static void setSelectedIcon(int id) {
        selectedIcon = id;
    }
}
