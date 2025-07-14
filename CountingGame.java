/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package QuestionTwo;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Hafsa Juma
 */
public class CountingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //Prompting the user for their name
        System.out.println("What is your name: ");
        String playerName = sc.nextLine();
        
       // Initializing the score to 0
        int score = 0;
                
       Random random = new Random();
       
       int numQuestions = 7;
       
       //for loop to ask the questions
        for (int i = 0; i < numQuestions; i++) {
            
            int num1 = random.nextInt(50);
            int num2 = random.nextInt(60);
            System.out.println("----------------------------");
            System.out.println("Question" + (i + 1) + "What is \n" +num1 + "+" + num2 + "?");
            System.out.println("-----------------------------");
            int playerAnswer = sc.nextInt();
            
            int rightAnswer = num1 + num2;
            
            if (playerAnswer == rightAnswer) {
                System.out.println("Yes, you got this right !!");
                score++;
            } else {
                System.out.println("Sorry, you got this wrong \n the correct answer is:" + rightAnswer);
                
            }
        }
                
                        
        System.out.println("***********************************");
        System.out.println("Player: " + playerName);
        System.out.println("Final Score: " + score);
                        
                
    }
    
}
//Chat- GPT used for the java random idea.
