/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author devin
 */
public class Multiplier {
    private int number;
    

    
    public Multiplier(int number){
        this.number = number;
    }
    
    public int getNumber(){
        return this.number;
    }
    
    
    public int multiply(int otherNumber){
        return number * otherNumber;
        
    }
    
}
