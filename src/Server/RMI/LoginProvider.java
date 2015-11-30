/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server.RMI;

import java.rmi.server.UnicastRemoteObject;
import Shared.Interfaces.ILoginProvider;
import Server.Domain.Player;
import java.util.Map;

/**
 *
 * @author Martijn
 */
public class LoginProvider implements UnicastRemoteObject, ILoginProvider {
    Map<String, Player> mapTokenPlayer;
}
