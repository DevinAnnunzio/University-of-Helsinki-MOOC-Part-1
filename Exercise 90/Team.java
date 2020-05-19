
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author devin
 */
public class Team {
    private String teamName;
    private int teamMaxSize;
    
    private ArrayList<Player> players = new ArrayList<Player>();
    
    
    public Team(String team){
        teamName = team;
        teamMaxSize = 16;
    }
    
    public String getName(){
        return teamName;
    }
    
    public void addPlayer(Player player){
        if(players.size() < teamMaxSize)
        this.players.add(player);
    }
    
    public void printPlayers(){
        for(Player player:players){
            System.out.println(player);
        }
    }
    
    public void setMaxSize(int maxSize){
        teamMaxSize = maxSize;        
    }
    
    public int size(){
        return players.size();
        }
    
    public int goals(){
        int totalGoals = 0;
        
        for(Player player:players){
            totalGoals += player.goals();
        }
        return totalGoals;
    }
    }

