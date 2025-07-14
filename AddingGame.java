/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuestionTwo;
import java.util.Random;
/**
 *
 * @author Hafsa Juma
 */
//Used inheritance
public class AddingGame extends Game{
    private int numQuestions;
    private Random random;
    
    public AddingGame(String playerName, int numQuestions) {
        super(playerName);
        this.numQuestions = numQuestions;
        this.random = new Random();
    }
      
            
        }
    

