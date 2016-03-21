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
        champions.add(new Champion("Ekko","28-05-2015",8, "Assassin"));
        champions.add(new Champion("Elise","26-10-2012",9, "Mage"));
        champions.add(new Champion("Evelynn","01-05-2009",10, "Assassin"));
        champions.add(new Champion("Ezreal","16-03-2010",7, "Marksman"));
        champions.add(new Champion("Fiddlesticks","21-02-2009",9, "Mage"));
        champions.add(new Champion("Fiora","29-02-2002",3, "Fighter"));
        champions.add(new Champion("Fizz","15-11-2011",6, "Assassin"));
        champions.add(new Champion("Galio","10-08-2010",3, "Tank"));
        champions.add(new Champion("Gangplank","19-08-2009",9, "Fighter"));
        champions.add(new Champion("Garen","27-04-2010",5, "Fighter"));
        champions.add(new Champion("Gnar","14-08-2014",8, "Fighter"));
        champions.add(new Champion("Gragas","02-02-2010",5, "Fighter"));
        champions.add(new Champion("Graves","19-10-2011",3, "Marksman"));
        champions.add(new Champion("Hecarim","18-04-2012",6, "Fighter"));
        champions.add(new Champion("Heimerdinger","10-10-2009",8, "Mage"));
        champions.add(new Champion("Illaoi","24-11-2015",4, "Fighter"));
        champions.add(new Champion("Irelia","16-11-2010",5, "Fighter"));
        champions.add(new Champion("Janna","02-09-2009",7, "Support"));
        champions.add(new Champion("Jarvan IV","01-03-2011",5, "Tank"));
        champions.add(new Champion("Jax","21-02-2009",5, "Fighter"));
        champions.add(new Champion("Jayce","07-07-2012",7, "Fighter"));
        champions.add(new Champion("Jhin","01-02-2016",6, "Marksman"));
        champions.add(new Champion("Jinx","10-10-2013",6, "Marksman"));
        champions.add(new Champion("Kalista","20-11-2014",7, "Marksman"));
        champions.add(new Champion("Karma","01-02-2011",5, "Support"));
        champions.add(new Champion("Karthus","12-06-2009",7, "Mage"));
        champions.add(new Champion("Kassadin","07-08-2009",8, "Assassin"));
        champions.add(new Champion("Katarina","19-09-2009",8, "Assassin"));
        champions.add(new Champion("Kayle","21-02-2009",7, "Fighter"));
        champions.add(new Champion("Kennen","08-04-2010",4, "Mage"));
        champions.add(new Champion("Kha'Zix","27-09-2012",6, "Assassin"));
        champions.add(new Champion("Kindred","14-10-2015",4, "Marksman"));
        champions.add(new Champion("Kog'Maw","24-06-2010",6, "Marksman"));
        champions.add(new Champion("LeBlanc","02-11-2010",9, "Assassin"));
        champions.add(new Champion("Lee Sin","01-04-2011",6, "Fighter"));
        champions.add(new Champion("Leona","13-07-2011",4, "Tank"));
        champions.add(new Champion("Lissandra","30-04-2013",6, "Mage"));
        champions.add(new Champion("Lucian","22-08-2013",6, "Marksman"));
        champions.add(new Champion("Lulu","20-03-2012",5, "Support"));
        champions.add(new Champion("Lux","09-10-2010",5, "Mage"));
        champions.add(new Champion("Malphite","02-09-2009",2, "Tank"));
        champions.add(new Champion("Malzahar","01-06-2010",6, "Mage"));
        champions.add(new Champion("Maokai","16-02-2011",3, "Tank"));
        champions.add(new Champion("Master Yi","21-02-2009",4, "Assassin"));
        champions.add(new Champion("Miss Fortune","08-09-2009",1, "Marksman"));
        champions.add(new Champion("Mordekaiser","24-02-2010",4, "Fighter"));
        champions.add(new Champion("Morgana","21-02-2009",1, "Mage"));
        champions.add(new Champion("Nami","07-12-2012",5, "Support"));
        champions.add(new Champion("Nasus","01-10-2009",6, "Fighter"));
        champions.add(new Champion("Nautilus","14-02-2012",6, "Tank"));
        champions.add(new Champion("Nidalee","17-12-2009",8, "Assassin"));
        champions.add(new Champion("Nocturne","15-03-2011",4, "Assassin"));
        champions.add(new Champion("Nunu","21-02-2009",4, "Support"));
        champions.add(new Champion("Olaf","09-06-2010",3, "Fighter"));
        champions.add(new Champion("Orianna","01-06-2011",7, "Mage"));
        champions.add(new Champion("Pantheon","02-02-2010",4, "Fighter"));
        champions.add(new Champion("Poppy","13-01-2010",7, "Tank"));
        champions.add(new Champion("Quinn","01-03-2013",5, "Marksman"));
        champions.add(new Champion("Rammus","10-07-2009",5, "Tank"));
        champions.add(new Champion("Rek'Sai","11-12-2014",3, "Fighter"));
        champions.add(new Champion("Renekton","18-01-2011",3, "Fighter"));
        champions.add(new Champion("Rengar","21-08-2012",8, "Assassin"));
        champions.add(new Champion("Riven","14-09-2011",8, "Fighter"));
        champions.add(new Champion("Rumble","26-04-2011",10, "Fighter"));
        champions.add(new Champion("Ryze","21-02-2009",7, "Mage"));
        champions.add(new Champion("Sejuani","17-01-2012",4, "Tank"));
        champions.add(new Champion("Shaco","10-10-2009",9, "Assassin"));
        champions.add(new Champion("Shen","24-03-2010",4, "Tank"));
        champions.add(new Champion("Shyvana","01-11-2011",4, "Fighter"));
        champions.add(new Champion("Singed","18-04-2009",5, "Tank"));
        champions.add(new Champion("Sion","21-02-2009",5, "Tank"));
        champions.add(new Champion("Sivir","21-02-2009",4, "Marksman"));
        champions.add(new Champion("Skarner","09-08-2011",5, "Fighter"));
        champions.add(new Champion("Sona","21-09-2010",4, "Support"));
        champions.add(new Champion("Soraka","21-02-2009",3, "Support"));
        champions.add(new Champion("Swain","05-10-2010",8, "Mage"));
        champions.add(new Champion("Syndra","13-09-2012",8, "Mage"));
        champions.add(new Champion("Tahm Kench","09-07-2015",3, "Support"));
        champions.add(new Champion("Talon","24-08-2011",7, "Assassin"));
        champions.add(new Champion("Taric","19-08-2009",5, "Support"));
        champions.add(new Champion("Teemo","21-02-2009",6, "Marksman"));
        champions.add(new Champion("Thresh","23-01-2013",7, "Support"));
        champions.add(new Champion("Tristana","21-02-2009",4, "Marksman"));
        champions.add(new Champion("Trundle","01-12-2010",5, "Fighter"));
        champions.add(new Champion("Tryndamere","01-05-2009",5, "Fighter"));
        champions.add(new Champion("Twisted Fate","21-02-2009",9, "Mage"));
        champions.add(new Champion("Twitch","01-05-2009",6, "Marksman"));
        champions.add(new Champion("Udyr","02-12-2009",7, "Fighter"));
        champions.add(new Champion("Urgot","24-08-2010",8, "Marksman"));
        champions.add(new Champion("Varus","08-05-2012",2, "Marksman"));
        champions.add(new Champion("Vayne","10-05-2011",8, "Marksman"));
        champions.add(new Champion("Veigar","24-07-2009",7, "Mage"));
        champions.add(new Champion("Vel'Koz","27-02-2014",8, "Mage"));
        champions.add(new Champion("Vi","19-12-2012",4, "Fighter"));
        champions.add(new Champion("Viktor","29-12-2011",9, "Mage"));
        champions.add(new Champion("Vladimir","27-07-2010",7, "Mage"));
        champions.add(new Champion("Volibear","29-11-2011",3, "Fighter"));
        champions.add(new Champion("Warwick","21-02-2009",3, "Fighter"));
        champions.add(new Champion("Wukong","26-07-2011",3, "Fighter"));
        champions.add(new Champion("Xerath","05-10-2011",8, "Mage"));
        champions.add(new Champion("Xin Zhao","13-07-2010",2, "Fighter"));
        champions.add(new Champion("Yasuo","13-12-13",10, "Fighter"));
        champions.add(new Champion("Yorrick","22-06-2011",4, "Fighter"));
        champions.add(new Champion("Zac","29-03-2013",8, "Tank"));
        champions.add(new Champion("Zed","13-11-2012",7, "Assassin"));
        champions.add(new Champion("Ziggs","01-02-2012",4, "Mage"));
        champions.add(new Champion("Zilean","18-04-2009",6, "Support"));
        champions.add(new Champion("Zyra","24-07-2012",7, "Mage"));
//        
    }
    
}
