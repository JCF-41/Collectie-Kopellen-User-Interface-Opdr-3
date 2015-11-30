/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client.GUI;

import Shared.Domain.HeroCard;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

/**
 *
 * @author Matthijs
 */
public class HeroCardControl {
    private final HeroCard heroCard;
    private final int width;
    private EventHandler handler;
    
    
    public HeroCardControl(HeroCard heroCard, int width){
        this.heroCard = heroCard;
        this.width = width;
    }
    
    public void setEventHandler(EventHandler handler){
        this.handler = handler;
    }
    
    public HeroCard getHeroCard(){
        return heroCard;
    }
    
    public StackPane HeroCardControlPane(){
        ImageView imOverlay = new ImageView("/Client/Images/Card Template.png");
        //ImageView imNic = new ImageView(heroCard.getFilename());
        ImageView imNic = new ImageView("/Client/Images/question-mark.jpg");
        imOverlay.setPreserveRatio(true);
        imNic.setPreserveRatio(true);
        imOverlay.setFitWidth(width);
        imNic.setFitWidth(width);

        Font font = new Font("Matura MT Script Capitals", 18.0);
        Font fontBig = new Font("Matura MT Script Capitals", 22.0);
        //name
        Label lName = new Label(heroCard.getName());
        lName.setFont(fontBig);
        lName.setLayoutX(70);
        lName.setLayoutY(150);
        lName.setAlignment(Pos.CENTER);
        //lName.setMaxWidth(width/6*4);
        lName.setPrefWidth(width/6*5);
        lName.setTextAlignment(TextAlignment.CENTER);
        
        //sword x=58 y=360
        Label lPAttack = new Label(heroCard.getPhysicalDamage() + "");
        lPAttack.setFont(font);
        lPAttack.setLayoutX(88);
        lPAttack.setLayoutY(200);
        lPAttack.setTextFill(Color.web("#FFFFFF"));
        
        //Schield x=52 y=436
        Label lPDefence = new Label(heroCard.getPhysicalBlock() + "");
        lPDefence.setFont(font);
        lPDefence.setLayoutX(88);
        lPDefence.setLayoutY(242);
        lPDefence.setTextFill(Color.web("#FFFFFF"));
        
        //MAttack x=235 y=366
        Label lMAttack = new Label(heroCard.getMagicalDamage() + "");
        lMAttack.setFont(font);
        lMAttack.setLayoutX(200);
        lMAttack.setLayoutY(200);
        lMAttack.setTextFill(Color.web("#FFFFFF"));
        
        //Mschield x=238 y=442
        Label lMDefence = new Label(heroCard.getMagicalBlock() + "");
        lMDefence.setFont(font);
        lMDefence.setLayoutX(200);
        lMDefence.setLayoutY(240);
        lMDefence.setTextFill(Color.web("#FFFFFF"));
        
        //hart x=148, y=441
        Label lHeal = new Label(heroCard.getHealValue() + "");
        lHeal.setFont(font);
        lHeal.setLayoutX(145);
        lHeal.setLayoutY(220);
        lHeal.setTextFill(Color.web("#000000"));
        
        AnchorPane pane = new AnchorPane();
        pane.getChildren().addAll(lName, lPAttack, lPDefence, lMAttack, lMDefence, lHeal);
        pane.setMinWidth(300);
        pane.setOnMouseClicked(handler);
        
        Group grImg = new Group(imNic, imOverlay);
        
        StackPane root = new StackPane();
        root.getChildren().add(grImg);
        root.getChildren().add(pane);
        return root;
        
    }
}
