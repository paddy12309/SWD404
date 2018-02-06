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
public class TableBooking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //tables
        Table t1 = new Table(outside, 5, 1);
        Table t2 = new Table(outside, 2, 2);
        Table t3 = new Table(outside, 4, 3);
        Table t4 = new Table(inside, 2, 4);
        Table t5 = new Table(inside, 6, 5);
        Table t6 = new Table(inside, 4, 6);
        Table t7 = new Table(inside, 10, 7);
        
        //staff 
        Staff s1 = new Staff("James");
        Staff s2 = new Staff("Amy");
        Staff s3 = new Staff("Sarah");
        
        //bookings
        Booking b1 = new Booking("King", 4, outside);
        Booking b2 = new Booking("Iris", 8, inside);
        Booking b3 = new Booking("delaplace, 3, inside");
        Booking b4 = new Booking("A-H", 2, outside);
        
        
    }
    
}
