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
    private boolean in;
    private Staff waiter;
    private Booking book;
    
    //constuctor
    public Table(boolean inIn, int numSeatIn, int numberIn)
    {
        number = numberIn;
        numSeat = numSeatIn;
        in = inIn;
    }
    //methods
    public void assignStaff(Staff staffIn)
    {
        //name = getNameIn
        waiter = staffIn;
    }
    public boolean assignBooking(Booking bookingIn)
    {
        int numGuest = bookingIn.getNumberOfGuests();
        if((numSeat >= numGuest)&&(in == bookingIn.isIn()))
            book = bookingIn;
            return true;
        else
        {
            return false;
        }
    }
    public void clearTable()
    {
        
    }
    
    
}
