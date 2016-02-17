package biz.nsdc.smashup;

import edu.frontrange.csc233.cardwolf.Card;

/**
 *
 * @author Chris
 */

//I can't get my computer to reconize the import from cardwolf- It will only download the whole folder as a Java file remove the // and it should work 
//import edu.frountrange.csc233.cardwolf.Card

public class SmashupCard extends Card{

SmashupCard(String name)
{
    this.name=name;
}
    
private final String name;

public String getName()
    {
    return name;
    }   


}
