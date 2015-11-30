/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shared.Interfaces;

import java.rmi.Remote;

/**
 *
 * @author Loek
 */
public interface ILoginProvider extends Remote {

    public String loginPlayer(String Displayname, String Password);

    public int signUpPlayer(String email, String displayname, String password, String passcheck);
}
