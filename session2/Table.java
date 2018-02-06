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
public class Table {
    //attributes 
    private int number;
    private int numSeat;
    private boolean inOrOut;
    private Staff name;
    private Booking book;
    
    //constuctor
    public Table(boolean inOrOutIn, int numSeatIn, int numberIn)
    {
        number = numberIn;
        numSeat = numSeatIn;
        inOrOut = inOrOutIn;
    }
    //methods
    public void assignStaff()
    {
        name = Staff.name;
    }
    public boolean assignTable()
    {
        return (numSeat >= numSeatIn)&&(inOrOut == inOrOutIn);
    }
    public void clearTable()
    {
        
    }
    
    
}
