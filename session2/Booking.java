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
    private String name;
    private int numberOfGuests;
    private boolean in;
    
    //constucter with parameters
    public Booking(String nameIn, int numberOfGuestsIn, boolean inIn )
    {
        name = nameIn;
        numberOfGuests = numberOfGuestsIn;
        in = inIn;
    }
    
    //getter methods
    public String getName()
    {
        return name;
    }
    public int getNumberOfGuests()
    {
        return numberOfGuests;
    }
    public boolean isIn()
    {
        return in;
    }
    
}
