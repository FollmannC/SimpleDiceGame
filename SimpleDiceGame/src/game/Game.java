package game;
import java.util.*;

public class Game {
  
   public void play() {
   
      // get input from user
      Scanner scnr = new Scanner(System.in);
      System.out.print("How much do you want to bet? ");                                                 
      int enteredBet = scnr.nextInt(); 
      System.out.print("What number do you choose ? ");
      int enteredNum = scnr.nextInt(); 
   
      // generate the die roll 
      Random randGen = new Random();
      int dieNum  =  randGen.nextInt(6) + 1;
      int dieNum2 = randGen.nextInt(6) + 1;
      System.out.println("The dice are " + dieNum + " and "+ dieNum2);
      if(dieNum == enteredNum && enteredNum == dieNum2) {
    	  System.out.println("You win " + (enteredBet*50) + " dollars!");
      }
      else{System.out.println("Sorry. You lost");}
   
      // write the rest of your code below
        
   }
}

