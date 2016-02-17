/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biz.nsdc.smashup;

import biz.nsdc.util.aDeck;
import edu.frontrange.csc233.cardwolf.Card;
import edu.frontrange.csc233.cardwolf.CardWolfEngine;
import java.util.Random;
import collect.ImmutableList;

/**
 *
 * @author Chris
 */
public class SmashupEngine extends aDeck implements CardWolfEngine{

    ImmutableList a = new ImmutableList();

public final int DECKSIZE=5;
    

//this should create a new deck with the defined cards
this.deck = ImmutableList.of(
                new FactionCard("Warbot", 4, Faction.Robots,"Ongoing: This minion Cannot be destroyed."),
                new FactionCard("ZapBot", 2, Faction.Robots, "You may play an extra minion of power 2 or less."),
                new FactionCard("Microbot Fixer", 1, Faction.Robots,"if this is the first minon you play this turn, you may play an extra minion. Ongoing: Each of your micorbots gains +1 power"),
                new FactionCard("HoverBot", 3, Faction.Robots,"Reveal the top card of your deck. if it is a miinion, you may play it as an extra minion. Otherwise, return it to the top of your deck."),
                new FactionCard("HoverBot", 3, Faction.Robots, "Reveal the top card of your. If it is a minion, you may play it as an extra minion. Otherwise, return it to the top of your deck."),
                new FactionCard("ZapBot", 2, Faction.Robots, "YOu may play an extra minion of power 2 or less."));
   


    
public ImmutableList<? extends Card> dealHand()
    {
    boolean picked=false;
    Random random = new Random();
    
    //I need to draw 5 cards that are all different
    //cardPosition should give me 5 unique card positions to draw cards from
    int[] cardPosition;
    for (int i=0; i<5; i++)
        {
        
        picked=false;
        int a = random.nextInt(DECKSIZE);
        
        //this should compair a to the other numbers stored in cardPosition
        for(int j=0; j<cardPosition.length;j++)
            {
                //if the number already exists picked will become true
            if(a==cardPosition[j])
                picked=true;
            }    
        //after the check is run if the possition is available it will be assigned 
        if(picked==false)
            {
            cardPosition[i]=a;
            }
        }   
     
    //now that I have the positions of the drawn hand I need to create an ImmutableList with the cards.
    ImmutableList<FactionCard> hand = ImmutableList.of(
        deck.get(cardPostition[0]),deck.get(cardPostition[1]),deck.get(cardPostition[2]),deck.get(cardPostition[3]),deck.get(cardPostition[4]));
    return hand;
    
    }

    @Override
    public <T extends Card> shuffle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
