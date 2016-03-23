/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectie.koppelen.aan.de.user.pkginterface;

import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.TreeSet;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

/**
 * FXML Controller class
 *
 * @author Stan
 */
public class ChampionListFXMLController implements Initializable {

    
    
    @FXML
    private TreeView tvChampions;
    
    @FXML
    private TableView tvInformation;
    
    private List<Champion> champions;
    //Om GUI en list hetzelfde te houden
    private ObservableList<Champion> observableChampions;
    
    private List<Ability> abilities;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        generateChampions();
        generateAbilities();
        
        TreeItem<String> rootItem = new TreeItem<String> ("Roles");
        rootItem.setExpanded(true);
        
        Set<String> roles = new TreeSet<>();
        for (Champion champ : champions) {
            roles.add(champ.getCategory());
        }
        System.out.println(roles);
        //Add Roles
        Iterator<String> it = roles.iterator();
        while(it.hasNext()) {
            TreeItem<String> item = new TreeItem<String> (it.next());
            rootItem.getChildren().add(item);
        }
        
        //Add champs to those roles
        
        for(Champion champ : champions) {
            TreeItem<String> item = new TreeItem<String> (champ.getName());   
            for(TreeItem<String> role : rootItem.getChildren()) {
                if(role.getValue().contains(champ.getCategory())) {
                    role.getChildren().add(item);
                }
            }
            
        }
        tvChampions.setRoot(rootItem);
    }
    
    public void generateChampions() {
        champions = new ArrayList<>();
        
        //Lectografic
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
    }
    
    public void generateAbilities() {
        abilities = new ArrayList<>();
        //Aatrox
        abilities.add(new Ability("P","Blood Well"));
        abilities.add(new Ability("Q","Dark Flight"));
        abilities.add(new Ability("W","Blood Thrist / Blood Price"));
        abilities.add(new Ability("E","Blades of Torment"));
        abilities.add(new Ability("R","Massacre"));
        
        //Ahri
        abilities.add(new Ability("P","Essense Theft"));
        abilities.add(new Ability("Q","Orb of Deception"));
        abilities.add(new Ability("W","Fox-Fire"));
        abilities.add(new Ability("E","Charm"));
        abilities.add(new Ability("R","Spirit Rush"));
        
        //Akali
        abilities.add(new Ability("P","Twin Disiplines"));
        abilities.add(new Ability("Q","Mark of the Assassin"));
        abilities.add(new Ability("W","Twilight Shroud"));
        abilities.add(new Ability("E","Crescent Slash"));
        abilities.add(new Ability("R","Shadow Dance"));
        
        //Alistar
        abilities.add(new Ability("P","Trample"));
        abilities.add(new Ability("Q","Pulverize"));
        abilities.add(new Ability("W","Headbutt"));
        abilities.add(new Ability("E","Triumphant Roar"));
        abilities.add(new Ability("R","Unbreakable Will"));
        
        //Amumu
        abilities.add(new Ability("P","Cursed Touch"));
        abilities.add(new Ability("Q","Bandadge Toss"));
        abilities.add(new Ability("W","Despair"));
        abilities.add(new Ability("E","Tantrum"));
        abilities.add(new Ability("R","Curse of the Sad Mummy"));
        
        //Anivia
        abilities.add(new Ability("P","Rebirth"));
        abilities.add(new Ability("Q","Flash Frost"));
        abilities.add(new Ability("W","Crystallize"));
        abilities.add(new Ability("E","Frostbite"));
        abilities.add(new Ability("R","Glacial Storm"));
        
        //Annie
        abilities.add(new Ability("P","Pyromania"));
        abilities.add(new Ability("Q","Disintegrate"));
        abilities.add(new Ability("W","Incinerate"));
        abilities.add(new Ability("E","Molten Shield"));
        abilities.add(new Ability("R","Summon: Tibbers"));
        
        //Ashe
        abilities.add(new Ability("P","Frost Shot"));
        abilities.add(new Ability("Q","Ranger's Focus"));
        abilities.add(new Ability("W","Volley"));
        abilities.add(new Ability("E","Hawkshot"));
        abilities.add(new Ability("R","Enchanted Crystal Arrow"));
        
        //Azir
        abilities.add(new Ability("P","Shurima's Legacy"));
        abilities.add(new Ability("Q","Conquering Sands"));
        abilities.add(new Ability("W","Arise!"));
        abilities.add(new Ability("E","Shifting Sands"));
        abilities.add(new Ability("R","Emperor's Divide"));
        
        //Bard
        abilities.add(new Ability("P","Traveler's Call"));
        abilities.add(new Ability("Q","Cosmic Binding"));
        abilities.add(new Ability("W","Caretaker's Shrine"));
        abilities.add(new Ability("E","Magical Journey"));
        abilities.add(new Ability("R","Tempered Fate"));
        
        //Blitzcrank
        abilities.add(new Ability("P","Mana Barrier"));
        abilities.add(new Ability("Q","Rocket Grab"));
        abilities.add(new Ability("W","Overdrive"));
        abilities.add(new Ability("E","Power Fist"));
        abilities.add(new Ability("R","Static Field"));
        
        //Brand
        abilities.add(new Ability("P","Blaze"));
        abilities.add(new Ability("Q","Sear"));
        abilities.add(new Ability("W","Pillar of Flame"));
        abilities.add(new Ability("E","Conflagration"));
        abilities.add(new Ability("R","Pyroclasm"));
        
        //Braum
        abilities.add(new Ability("P","Concussive Blows"));
        abilities.add(new Ability("Q","Winter's Bite"));
        abilities.add(new Ability("W","Stand Behind Me"));
        abilities.add(new Ability("E","Unbreakable"));
        abilities.add(new Ability("R","Glacial Fissure"));
        
        //Caitlyn
        abilities.add(new Ability("P","Headshot"));
        abilities.add(new Ability("Q","Piltover Peacemaker"));
        abilities.add(new Ability("W","Yordle Snap Trap"));
        abilities.add(new Ability("E","90 Caliber Net"));
        abilities.add(new Ability("R","Ace in the Hole"));
        
        //Cassiopeia
        abilities.add(new Ability("P","Aspect of the Serpent"));
        abilities.add(new Ability("Q","Noxious Blast"));
        abilities.add(new Ability("W","Miasma"));
        abilities.add(new Ability("E","Twin Fang"));
        abilities.add(new Ability("R","Petrifying Gaze"));
        
        //Cho'Gath
        abilities.add(new Ability("P","Carnivore"));
        abilities.add(new Ability("Q","Rupture"));
        abilities.add(new Ability("W","Feral Scream"));
        abilities.add(new Ability("E","Vorpal Spikes"));
        abilities.add(new Ability("R","Feast"));
        
        //Corki
        abilities.add(new Ability("P","Hextech Munitions"));
        abilities.add(new Ability("Q","Phosphorus Bomb"));
        abilities.add(new Ability("W","Valkyrie / Special Delivery"));
        abilities.add(new Ability("E","Gatling Gun"));
        abilities.add(new Ability("R","Missle Barrage"));
        
    }
    
}
