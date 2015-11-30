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
public class RegisterFXMLController implements Initializable {

    private Stage stage;
    private Parent root;

    @FXML
    private TextField tfEmail;

    @FXML
    private TextField tfUserName;

    @FXML
    private TextField tfPassWord;

    @FXML
    private TextField tfPassWordRe;

    @FXML
    private Button btnRegisterAccount;

    @FXML
    private Button btnBack;

    Player player;

    //Variables for playing sound.
    private final String buttonPressFilePath = "src/Sound/buttonPress.wav";
    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    /**
     * Adds the account to the database and goes to the MainScreen if everything
     * is filled in correctly. Fields are correct: If both Fields are filled. If
     * the Username is unique. If the two password fields are the same.
     *
     * @param event
     * @throws IOException
     */
    @FXML
    private void btnRegisterAccount_OnClick(ActionEvent event) throws IOException {
        SoundController.play(SoundController.SoundFile.BUTTONPRESS);
        
        //Check  if  the UserName already exists
        //If not, Check if the 2 inserted passwords match. If they do, Make the Account.
        if (tfEmail.getText().isEmpty() || tfUserName.getText().isEmpty() || tfPassWord.getText().isEmpty() || tfPassWordRe.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fill all the fields.", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int result = playerIconController.signUpPlayer(tfEmail.getText(), tfUserName.getText(), tfPassWord.getText(), tfPassWordRe.getText());
            switch (result) {
                case 0:
                    JOptionPane.showMessageDialog(null, "An unexpected error occurred.", "Error", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("An unexpected error occurred.");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "The two inserted passwords do NOT match.", "Error", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("The two inserted passwords do NOT match.");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Account already exists.", "Error", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("Account already exists in the datbase.");
                    break;
                case 3:
                    //Add the Player to the database.
                    String title = "Mighty Duels";
                    stage = (Stage) btnRegisterAccount.getScene().getWindow();
                    root = FXMLLoader.load(getClass().getResource("LogOnFXML.fxml"));
                    Client.Run.MightyDuelsClient.navigate(stage, root, title);
                    JOptionPane.showMessageDialog(null, "Account succesfully registered.", "Error", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("Account succesfully registered");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "An unexpected error occurred.", "Error", JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("An unexpected error occurred.");
                    break;
            }
        }
    }

    @FXML
    private void btnBack_OnClick(ActionEvent event) throws IOException {
        SoundController.play(SoundController.SoundFile.BUTTONPRESS);
        
        String title = "Mighty Duels";
        stage = (Stage) btnBack.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("LogOnFXML.fxml"));
        Client.Run.MightyDuelsClient.navigate(stage, root, title);
    }

}
