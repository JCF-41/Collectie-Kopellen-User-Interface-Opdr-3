/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shared.Interfaces;

import Shared.Domain.*;
import java.rmi.Remote;
import java.util.List;

/**
 *
 * @author Loek
 */
public interface IMainscreenProvider extends Remote {
    /**
     * 
     * @param token
     * @return 
     */

    public String getNewMatch(String token);

    public List<Card> getCards();

    public List<Deck> getDeck(String token);

    public List<Icon> getIcons(String token);

    public boolean setIcons(String token, int iconID);

    public boolean addDeck(String token, List<Card> cards, String name);

    public boolean removeDeck(String token, String name);

    public Player getPlayer(String token);

}
