/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Scanner;

/**
 *
 * @author Corjan Zee
 */
public class GameRunner {
      /**
     *This allows the game to play a game
     */
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Welcome to this game of Tick tack to");
       System.out.println("You will have to select which board you would like:3x3, 4x4 or 5x5.");
       System.out.println("Press 1 and to play a 3x3 game");
       System.out.println("Press 2 and to play a 4x4 game");
       System.out.println("Press 3 and to play a 5x5 game");
       System.out.println("Press 4 and to play a 6x6 game");
       System.out.println("Press 5 and to play a 7x7 game");
       System.out.println("But by default if you don't press anything a 4X4 game will begin");
       
       int size = keyboard.nextInt();
       int boardSize;
       switch (size){
           case 1: boardSize = 4;
                   break;
           case 2: boardSize = 5;
                   break;
           case 3: boardSize = 6;
                   break;
           case 4: boardSize = 7;
                   break;
           case 5: boardSize = 8;
                   break;
           default: boardSize = 5;
                   break;
       }
       Game tictac = new Game(boardSize);
       tictac.playGame();
       
       
    }
       
}
