/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author devin
 */
public class Player {
    private String playerName;
    private int amountOfGoals;
    
    public Player(String playerName){
        this.playerName = playerName;
        amountOfGoals = 0;
    }
    
    public Player(String playerName,int amountOfGoals){
        this.playerName = playerName;
        this.amountOfGoals = amountOfGoals;
    }
    
    public String getName(){
        return playerName;
    }
    
    public int goals(){
        return amountOfGoals;
    }
    
    public String toString(){
        return playerName + ", goals " + amountOfGoals;
    }
    
    
}
