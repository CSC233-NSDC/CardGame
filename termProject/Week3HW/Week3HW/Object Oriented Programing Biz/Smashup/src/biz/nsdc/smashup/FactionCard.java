/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biz.nsdc.smashup;

/**
 *
 * @author Chris
 */
//in the game Smashup there are base cards that get played on and there are the cards that people hold in thier hands- these are the ones that get held in thier hands

public class FactionCard extends SmashupCard{
 
//constructor with no rulesText
FactionCard(String name,int power,Faction faction)
    { super(name);
    this.power=power;
    this.faction=faction;
    }

//constructor with rulesText
FactionCard(String name, int power,Faction faction, String rulesText)
    {
        super(name);
        this.power=power;
        this.faction=faction;
        this.rulesText=rulesText;
    }    
 //this for now is anything special that happends with the card
private String rulesText;

//all creature cards have power
private int power;

//all cards belone to a faction- see Faction class
private Faction faction;

//returns a string
public String getRulesText()
    {
    return rulesText;
    }  

//set rules text
public void setRulesText(String rulesText)
    {
    this.rulesText=rulesText;
    }

//retunrs an int of power
public int getPower()
    {
    return power;
    }   

public void setPower(int power)
    {
    this.power=power;
    }

//returns an enum of the faction
public Faction getFaction()
    {
    return faction;
    }

//set faction, must use enum of type Faction
public void setFaction(Faction faction)
    {
    this.faction=faction;
    }

}
