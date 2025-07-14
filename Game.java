/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuestionTwo;

/**
 *
 * @author Hafsa Juma
 */
public class Game {
    protected String playerName;
    protected int score;
//Creating constructors for players name and score
public Game(String playerName) {
    this.playerName = playerName;
    this.score = 0;
}   
//Method to show the player their final score
    public void displayScore() {
        System.out.println("Player: "+ playerName );
        System.out.println("Your Final Score is:" + score);
    }
//Method to return the player's current score
    public int getScore() {
        return score;
    }
    
}
//This class is the base class for the adding game
