/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
import java.util.Scanner;

public class MyTeam {
    
    public static void main(String [] args) {
        
        Scanner console = new Scanner(System.in);
        
        //declare variables
        int id, attempted, made;
        String fName, lName;
        double percentage;
        
        //declare and create an array that can store 5 basketball player objects
        BasketballPlayer [] playerList = new BasketballPlayer[5];
        
        //get user input to create objets and populate the array
        for(int i=0; i<playerList.length; i++) {
            System.out.print("\nEnter Jersey Number: ");
            id = console.nextInt();
            System.out.print("Enter First Name: ");
            fName = console.next();
            System.out.print("Enter Last Name: ");
            lName = console.next();
            System.out.print("Enter Shots Attempted: ");
            attempted = console.nextInt();
            System.out.print("Enter Shots Made: ");
            made = console.nextInt();
            
            //create the object and place it into the array
            playerList[i] = new BasketballPlayer(id, fName, lName, attempted, made);
        }
        
        //output the player's information
        for(int i=0; i<playerList.length; i++) {
            System.out.println("\n" + playerList[i].toString());
            percentage = playerList[i].calculateShootingPercentage();
            System.out.printf("Shooting Percentage: %.2f %n", percentage);
        }
        
        //find the index of the player with the highest shooting percentage
        int maxIndex = 0;
        
        for(int i=1; i<playerList.length; i++) {
            if(playerList[i].calculateShootingPercentage() > 
               playerList[maxIndex].calculateShootingPercentage()) {
                maxIndex = i;
            }
        }
            
        //print the information of the player with the highest shooting percentage
        System.out.println("\nPlayer with the highest shooting percentage: ");
        System.out.println( playerList[maxIndex]);
        
    }//end main
}//end class
