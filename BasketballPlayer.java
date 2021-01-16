/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brian
 */
public class BasketballPlayer {
    //data members
    private int jerseyNumber;
    private String firstName;
    private String lastName;
    private int shotsAttempted;
    private int shotsMade;
    
    //default constructor

    public BasketballPlayer() {
        //data members are set to the default values
    }
    
    //overloaded constructor
    public BasketballPlayer(int jerseyNumber, String firstName, String lastName, int shotsAttempted, int shotsMade) {
        this.jerseyNumber = jerseyNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.shotsAttempted = shotsAttempted;
        this.shotsMade = shotsMade;
    }
    
    //setters and getters

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getShotsAttempted() {
        return shotsAttempted;
    }

    public void setShotsAttempted(int shotsAttempted) {
        this.shotsAttempted = shotsAttempted;
    }

    public int getShotsMade() {
        return shotsMade;
    }

    public void setShotsMade(int shotsMade) {
        this.shotsMade = shotsMade;
    }
    
    //calculate the shooting percentage
    public double calculateShootingPercentage() {
        return shotsMade / (double) shotsAttempted;
    }

    @Override
    public String toString() {
        return jerseyNumber + " " + firstName + " " + lastName + " " + 
               shotsAttempted + " " + shotsMade;
    }
    
    
}
