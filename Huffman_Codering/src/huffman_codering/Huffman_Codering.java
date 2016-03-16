/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huffman_codering;


import javafx.application.Application;
import javafx.stage.Stage;
import SortClasses.List_Setup;

/**
 *
 * @author Loek
 */
public class Huffman_Codering extends Application {

    private List_Setup lS = new List_Setup();

    @Override
    public void start(Stage primaryStage) {
        lS.createkarakterCount();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
