/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablebooking;

/**
 *
 * @author patrickrdwest
 */
public class Booking {
    
    //attributes
    private string name;
    private int numberOfGuests;
    private boolean inOrOut;
    
    //constucter with parameters
    public Booking(string nameIn, int numberOrGuestsIn, boolean inOrOutIn )
    {
        name = nameIn;
        numberOfGuests = numberOfGuestsIn;
        inOrOut = inOrOutIn;
    }
    
    //getter methods
    public string getName()
    {
        return name;
    }
    public int getNumberOfGuests()
    {
        return numberOfGuests;
    }
    public boolean getInOrOut()
    {
        return inOrOut;
    }
    
}
