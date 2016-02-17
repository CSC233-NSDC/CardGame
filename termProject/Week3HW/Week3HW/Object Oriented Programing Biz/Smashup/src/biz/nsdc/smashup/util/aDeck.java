/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biz.nsdc.smashup.util;
import edu.frontrange.csc233.cardwolf.Card;
import java.util.ArrayList;
/**
 *
 * @author chris_000
 */
public abstract class aDeck extends Card{

//I might need to change this to be an immutable list?
public ArrayList deck;    

public int size(){
    return deck.size();
}
//returns any object that extends Card
public <T extends Card> T drawCard(){
    //remove will return the element 
    return(T) (deck.remove(0));   
}
    
public abstract <T extends aDeck> T createDeck();   
}
