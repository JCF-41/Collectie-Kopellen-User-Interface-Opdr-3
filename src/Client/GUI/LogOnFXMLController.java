/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client.GUI;

import Client.Controller.SoundController;
import Client.Domain.Player;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Stan
 */
public class LogOnFXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
    private Stage stage;
    private Parent root;

    @FXML
    private TextField tfUserName;

    @FXML
    private TextField tfPassWord;

    @FXML
    private Button btnLogOn;

    @FXML
    private Button btnRegister;

    //Variables for playing sound.
    private final String buttonPressFilePath = "src/Sound/buttonPress.wav";
    
    /**
     * If the Username already exists, give a message. If the Username and
     * Password do not match. give a message. When The username and password
     * match with the ones in de database, Go to the Mainscreen.
     *
     * @param event
     * @throws IOException
     */
    @FXML
    private void btnLogOn_OnClick(ActionEvent event) {
        SoundController.play(SoundController.SoundFile.BUTTONPRESS);
        
        login();
    }

    /**
     * Go to the 'Register'-page to register an account.
     *
     * @param event
     * @throws IOException
     */
    @FXML
    private void btnRegister_OnClick(ActionEvent event) throws IOException {
        SoundController.play(SoundController.SoundFile.BUTTONPRESS);
        
        String title = "Mighty Duels";
        stage = (Stage) btnRegister.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("RegisterFXML.fxml"));
        Client.Run.MightyDuelsClient.navigate(stage, root, title);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tfUserName.setOnAction((evt)->{login();});
        tfPassWord.setOnAction((evt)->{login();});
    }
    
    private void login(){
        if (tfUserName.getText().isEmpty() || tfPassWord.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fill both fields.", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            Player player = PlayerIconController.logInPlayer(tfUserName.getText(), tfPassWord.getText());
            if (player == null) {
                JOptionPane.showMessageDialog(null, "Username & Password do not match.", "Error", JOptionPane.INFORMATION_MESSAGE);
                tfPassWord.setText("");
            } else {
                try {
                    Client.Run.MightyDuelsClient.loggedInPlayer = player;
                    //Give the player to the next page;
                    String title = "Mighty Duels Welcome: " + player.getUsername();
                    stage = (Stage) btnLogOn.getScene().getWindow();
                    root = FXMLLoader.load(getClass().getResource("MainScreenFXML.fxml"));
                    Client.Run.MightyDuelsClient.navigate(stage, root, title);
                } catch (IOException ex) {
                    Logger.getLogger(LogOnFXMLController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

}
