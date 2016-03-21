/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectie.koppelen.aan.de.user.pkginterface;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author Stan
 */
public class ChampionListFXMLController implements Initializable {

    
    
    
    
    private List<Champion> champions;
    private ObservableList<Champion> observableChampions;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        generateChampions();
    }
    
    public void generateChampions() {
        champions = new ArrayList<>();
        
        champions.add(new Champion("Aatrox","13-06-2013",4, "Fighter"));
        champions.add(new Champion("Ahri","14-12-2011",5, "Mage"));
        champions.add(new Champion("Akali","11-05-2010", 7, "Assassin"));
        champions.add(new Champion("Alistar","21-02-2009", 7, "Tank"));
        champions.add(new Champion("Amumu","26-06-2009",3, "Tank"));
        champions.add(new Champion("Anivia","10-07-2009",10, "Mage"));
        champions.add(new Champion("Annie","21-02-2009",6, "Mage"));
        champions.add(new Champion("Ashe","21-02-2009",4, "Marksman"));
        champions.add(new Champion("Azir","16-09-2014",9, "Mage"));
        champions.add(new Champion("Bard","12-03-2015",9, "Support"));
        champions.add(new Champion("Blitzcrank","02-09-2009",4, "Tank"));
        champions.add(new Champion("Brand","12-04-2011",4, "Mage"));
        champions.add(new Champion("Braum","12-05-2014",3, "Support"));
        champions.add(new Champion("Caitlyn","04-01-2011",6, "Marksman"));
        champions.add(new Champion("Cassiopeia","14-12-2010",10, "Mage"));
        champions.add(new Champion("Cho'Gath","26-06-2009",5, "Tank"));
        champions.add(new Champion("Corki","19-09-2009",6, "Marksman"));
        champions.add(new Champion("Darius","23-05-2012",2, "Fighter"));
        champions.add(new Champion("Diana","07-08-2012",4, "Fighter"));
        champions.add(new Champion("Dr. Mundo","02-09-2011",5, "Fighter"));
        champions.add(new Champion("Draven","06-06-2012",8, "Marksman"));
        //TODO
//        champions.add(new Champion("Ekko","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Elise","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Evelynn","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Ezreal","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Fiddlesticks","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Fiora","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Fizz","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Galio","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Gangplank","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Garen","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Gnar","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Gragas","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Graves","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Hecarim","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Heimerdinger","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Illaoi","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Irelia","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Janna","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Jarvan IV","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Jax","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Jayce","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Jhin","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Jinx","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Kalista","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Karma","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Karthus","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Kassadin","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Katarina","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Kayle","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Kennen","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Kha'Zix","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Kindred","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Kog'Maw","14-12-2011",5, "Mage"));
//        champions.add(new Champion("LeBlanc","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Lee Sin","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Leona","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Lissandra","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Lucian","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Lulu","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Lux","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Malphite","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Malzahar","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Maokai","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Master Yi","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Miss Fortune","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Mordekaiser","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Morgana","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Nami","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Nasus","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Nautilus","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Nidalee","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Nocturne","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Nunu","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Olaf","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Orianna","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Pantheon","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Poppy","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Quinn","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Rammus","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Rek'Sai","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Renekton","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Rengar","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Riven","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Rumble","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Ryze","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Sejuani","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Shaco","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Shen","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Shyvana","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Singed","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Sion","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Sivir","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Skarner","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Sona","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Soraka","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Swain","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Syndra","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Tahm Kench","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Talon","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Taric","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Teemo","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Thresh","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Tristana","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Trundle","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Tryndamere","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Twisted Fate","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Twitch","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Udyr","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Urgot","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Varus","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Vayne","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Veigar","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Vel'Koz","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Vi","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Viktor","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Vladimir","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Volibear","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Warwick","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Wukong","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Xerath","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Xin Zhao","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Yasuo","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Yorrick","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Zac","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Zed","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Ziggs","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Zilean","14-12-2011",5, "Mage"));
//        champions.add(new Champion("Zyra","14-12-2011",5, "Mage"));
//        
    }
    
}
