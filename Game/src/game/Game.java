/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import java.util.Scanner;
/**
 *This game supposedly runs a tictack to game
 */
public class Game {

     char board[][];
     String Statement;
     static int boardSize;
     static int validation;
     static int endGame;
    
     Scanner keyboard = new Scanner(System.in);
     /**
      * Will initalise the board
      */
     public Game(int boardSize) {
         board = new char[boardSize][boardSize];
         this.boardSize = boardSize;
     }
      public Game() {
         board = new char[5][5];
         this.boardSize = 5;
     }
     /**
      * 
      * This is the game which is being played.
      */
     public void playGame(){
       int playAgain;  
       do{  
       restBoard();  
       writeBoard();
       System.out.println("Who do you want to go first X or O");
       System.out.println("1 - X will go first");
       System.out.println("2 - O will go first");
       int XorO = keyboard.nextInt();
       int whoGoesFirst;
       switch (XorO){
           case 1: whoGoesFirst = 1;//to state that X goes first
                   break;
          default: whoGoesFirst = 2;//to state that O goes first 
                   break;
       }   
       int turn = whoGoesFirst;
       int row,column;
       for(int possibleTurns = 0;possibleTurns<((boardSize-1)*(boardSize-1));possibleTurns++){
       WhoTurnIsIt(turn);
       do{
       System.out.println("Below State the cordinates where you wish to place your Value");
       System.out.println("Please state the row number");
       row = keyboard.nextInt();
       System.out.println("Please State the Column");
       column = keyboard.nextInt();
       testing(row,column);
       }while(validation!=3);
       validation =2;
       inputValue(row,column,turn);
       writeBoard();
       testingWinners();
       if(endGame==1){
          possibleTurns=(boardSize)*(boardSize); 
       }
       turn++;
       }
      if(endGame==0){ 
      System.out.println("There was a draw");
      }
      endGame = 0;
      System.out.println("Do you want to play another game /nPress 1 - to exit the game /nPress 2 - to play a new game");
      playAgain = keyboard.nextInt();
     }while(playAgain!=1);
       }
     /**
      * This is supposed to input the value for the user turn.
      * @param row
      * @param column
      * @param turn 
      */
     private void inputValue(int row,int column,int turn ){
      if(turn%2==0){
        
            board[row-1][column-1] = 'O';       
                   }
         else{
           board[row-1][column-1] = 'X';         

        }
        
         
     }
     /**
      * This prints a line stating who turn it is  
      * @param a 
      */
     private void WhoTurnIsIt(int turn){
         if(turn%2==0){
        
            System.out.println("It is O Turn");         
                   }
         else{
           System.out.println("It is X Turn");         

        }
        
         }
     private void testingWinners(){
         int row, column;
     for(row = 0,column = 0;column<(boardSize-1)||row<(boardSize-1);row++,column++){
         /**
          * test for a 3X3 board
          */
        if (boardSize == 4){
          /**
           * testing the Rows for X or O
           */            
             if(((board[row][0]==('X'))&&(board[row][1]==('X'))&&(board[row][2]==('X')))){
             System.out.println("Player X has won the game");
             endGame = 1;
             break;
           }
             if(((board[row][0]==('O'))&&(board[row][1]==('O'))&&(board[row][2]==('O')))){
             System.out.println("Player O has won the game");
             endGame = 1;
             break;
           }
           /**
            * testing  the columns
            */  
           if(((board[0][column]==('X'))&&(board[1][column]==('X'))&&(board[2][column]==('X')))){
             System.out.println("Player X has won the game");
             endGame = 1;
             break;
           }
             if(((board[0][column]==('O'))&&(board[1][column]==('O'))&&(board[2][column]==('O')))){
             System.out.println("Player O has won the game");
             endGame = 1;
             break;
           }
     }
        /**
         * Test  is a 4X4
         */
        if(boardSize == 5){
             if(((board[row][0]==('X'))&&(board[row][1]==('X'))&&(board[row][2]==('X'))&&(board[row][3]==('X')))){
             System.out.println("Player X has won the game");
             endGame = 1;
             break;
           }
             if(((board[row][0]==('O'))&&(board[row][1]==('O'))&&(board[row][2]==('O'))&&(board[row][3]==('O')))){
             System.out.println("Player O has won the game");
             endGame = 1;
             break;
           }
           /**
            * testing  the columns
            */  
           if(((board[0][column]==('X'))&&(board[1][column]==('X'))&&(board[2][column]==('X'))&&(board[3][column]==('X')))){
             System.out.println("Player X has won the game");
             endGame = 1;
             break;
           }
             if(((board[0][column]==('O'))&&(board[1][column]==('O'))&&(board[2][column]==('O'))&&(board[3][column]==('O')))){
             System.out.println("Player O has won the game");
             endGame = 1;
             break;
           }
        }
        /**
         * test if for a 5X5
         */
        if(boardSize == 6){
            if(((board[row][0]==('X'))&&(board[row][1]==('X'))&&(board[row][2]==('X'))&&(board[row][3]==('X'))&&(board[row][4]==('X')))){
             System.out.println("Player X has won the game");
             endGame = 1;
             break;
           }
             if(((board[row][0]==('O'))&&(board[row][1]==('O'))&&(board[row][2]==('O'))&&(board[row][3]==('O'))&&(board[row][4]==('O')))){
             System.out.println("Player O has won the game");
             endGame = 1;
             break;
           }
           /**
            * testing  the columns
            */  
           if(((board[0][column]==('X'))&&(board[1][column]==('X'))&&(board[2][column]==('X'))&&(board[3][column]==('X'))&&(board[4][column]==('X')))){
             System.out.println("Player X has won the game");
             endGame = 1;
             break;
           }
             if(((board[0][column]==('O'))&&(board[1][column]==('O'))&&(board[2][column]==('O'))&&(board[3][column]==('O'))&&(board[4][column]==('O')))){
             System.out.println("Player O has won the game");
             endGame = 1;
             break;
           }
        }
        /**
         * testing 6X6 board
         */
        if(boardSize == 7){
            if(((board[row][0]==('X'))&&(board[row][1]==('X'))&&(board[row][2]==('X'))&&(board[row][3]==('X'))&&(board[row][4]==('X'))&&(board[row][5]==('X')))){
             System.out.println("Player X has won the game");
             endGame = 1;
             break;
           }
             if(((board[row][0]==('O'))&&(board[row][1]==('O'))&&(board[row][2]==('O'))&&(board[row][3]==('O'))&&(board[row][4]==('O'))&&(board[row][5]==('O')))){
             System.out.println("Player O has won the game");
             endGame = 1;
             break;
           }
           /**
            * testing  the columns
            */  
           if(((board[0][column]==('X'))&&(board[1][column]==('X'))&&(board[2][column]==('X'))&&(board[3][column]==('X'))&&(board[4][column]==('X'))&&(board[5][column]==('X')))){
             System.out.println("Player X has won the game");
             endGame = 1;
             break;
           }
             if(((board[0][column]==('O'))&&(board[1][column]==('O'))&&(board[2][column]==('O'))&&(board[3][column]==('O'))&&(board[4][column]==('O'))&&(board[5][column]==('O')))){
             System.out.println("Player O has won the game");
             endGame = 1;
             break;
           }
        }
        /**
         * Testing a 7X7 board 
         */
        if(boardSize == 8){
             if(((board[row][0]==('X'))&&(board[row][1]==('X'))&&(board[row][2]==('X'))&&(board[row][3]==('X'))&&(board[row][4]==('X'))&&(board[row][5]==('X'))&&(board[row][6]==('X')))){
             System.out.println("Player X has won the game");
             endGame = 1;
             break;
           }
             if(((board[row][0]==('O'))&&(board[row][1]==('O'))&&(board[row][2]==('O'))&&(board[row][3]==('O'))&&(board[row][4]==('O'))&&(board[row][5]==('O'))&&(board[row][6]==('O')))){
             System.out.println("Player O has won the game");
             endGame = 1;
             break;
           }
           /**
            * testing  the columns
            */  
           if(((board[0][column]==('X'))&&(board[1][column]==('X'))&&(board[2][column]==('X'))&&(board[3][column]==('X'))&&(board[4][column]==('X'))&&(board[5][column]==('X'))&&(board[6][column]==('X')))){
             System.out.println("Player X has won the game");
             endGame = 1;
             break;
           }
             if(((board[0][column]==('O'))&&(board[1][column]==('O'))&&(board[2][column]==('O'))&&(board[3][column]==('O'))&&(board[4][column]==('O'))&&(board[5][column]==('O'))&&(board[6][column]==('O')))){
             System.out.println("Player O has won the game");
             endGame = 1;
             break;
           }
        }           
     }
     /**
      * for a 3X3 board
      */
     if(boardSize==4){
     /**
      * Testing the first Diagonal
      */
         if(((board[0][0]==('X'))&&(board[1][1]==('X'))&&(board[2][2]==('X')))){
             System.out.println("Player X has won the game");
             endGame = 1;
         }
         if(((board[0][0]==('O'))&&(board[1][1]==('O'))&&(board[2][2]==('O')))){
             System.out.println("Player 0 has won the game");
             endGame = 1;
         } 
     /**
      * Testing the second Diagonal
      */
       if(((board[0][2]==('X'))&&(board[1][1]==('X'))&&(board[2][0]==('X')))){
             System.out.println("Player X has won the game");
             endGame = 1;
         }
         if(((board[0][2]==('O'))&&(board[1][1]==('O'))&&(board[2][0]==('O')))){
             System.out.println("Player 0 has won the game");
             endGame = 1;
         }         
     }
     /**
      * testing 4X4
      */
     if(boardSize==5){
         /**
           * Testing the first Diagonal
           */
         if(((board[0][0]==('X'))&&(board[1][1]==('X'))&&(board[2][2]==('X'))&&(board[3][3]==('X')))){
             System.out.println("Player X has won the game");
             endGame = 1;
         }
         if(((board[0][0]==('O'))&&(board[1][1]==('O'))&&(board[2][2]==('O'))&&(board[3][3]==('O')))){
             System.out.println("Player 0 has won the game");
             endGame = 1;
         } 
     /**
      * Testing the second Diagonal
      */
        if(((board[0][3]==('X'))&&(board[1][2]==('X'))&&(board[2][1]==('X'))&&(board[3][0]==('X')))){
             System.out.println("Player X has won the game");
             endGame = 1;
         }
        if(((board[0][3]==('O'))&&(board[1][3]==('O'))&&(board[3][1]==('O'))&&(board[3][0]==('O')))){
             System.out.println("Player 0 has won the game");
             endGame = 1;
         }
     }
     /**
      * testing 5X5 board
      */
     if(boardSize==6){
          /**
           * Testing the first Diagonal
           */
         if(((board[0][0]==('X'))&&(board[1][1]==('X'))&&(board[2][2]==('X'))&&(board[3][3]==('X'))&&(board[4][4]==('X')))){
             System.out.println("Player X has won the game");
             endGame = 1;
         }
         if(((board[0][0]==('O'))&&(board[1][1]==('O'))&&(board[2][2]==('O'))&&(board[3][3]==('O'))&&(board[4][4]==('O')))){
             System.out.println("Player 0 has won the game");
             endGame = 1;
         } 
     /**
      * Testing the second Diagonal
      */
        if(((board[0][4]==('X'))&&(board[1][3]==('X'))&&(board[2][2]==('X'))&&(board[3][1]==('X'))&&(board[4][0]==('X')))){
             System.out.println("Player X has won the game");
             endGame = 1;
         }
        if(((board[0][4]==('O'))&&(board[1][3]==('O'))&&(board[2][2]==('O'))&&(board[3][1]==('O'))&&(board[4][0]==('O')))){
             System.out.println("Player 0 has won the game");
             endGame = 1;
         }
     }
     /**
      * Testing for 6X6 board
      */
     if(boardSize == 7){
         /**
           * Testing the first Diagonal
           */
         if(((board[0][0]==('X'))&&(board[1][1]==('X'))&&(board[2][2]==('X'))&&(board[3][3]==('X'))&&(board[4][4]==('X'))&&(board[5][5]==('X')))){
             System.out.println("Player X has won the game");
             endGame = 1;
         }
         if(((board[0][0]==('O'))&&(board[1][1]==('O'))&&(board[2][2]==('O'))&&(board[3][3]==('O'))&&(board[4][4]==('O'))&&(board[5][5]==('O')))){
             System.out.println("Player 0 has won the game");
             endGame = 1;
         } 
     /**
      * Testing the second Diagonal
      */
        if(((board[0][5]==('X'))&&(board[1][4]==('X'))&&(board[2][3]==('X'))&&(board[3][2]==('X'))&&(board[4][1]==('X'))&&(board[5][0]==('X')))){
             System.out.println("Player X has won the game");
             endGame = 1;
         }
        if(((board[0][5]==('O'))&&(board[1][4]==('O'))&&(board[2][3]==('O'))&&(board[3][2]==('O'))&&(board[4][1]==('O'))&&(board[5][0]==('O')))){
             System.out.println("Player 0 has won the game");
             endGame = 1;
         }
     }
     /**
      * Testing for 7X7 board
      */
     if(boardSize == 8){
         /**
           * Testing the first Diagonal
           */
         if(((board[0][0]==('X'))&&(board[1][1]==('X'))&&(board[2][2]==('X'))&&(board[3][3]==('X'))&&(board[4][4]==('X'))&&(board[5][5]==('X'))&&(board[6][6]==('X')))){
             System.out.println("Player X has won the game");
             endGame = 1;
         }
         if(((board[0][0]==('O'))&&(board[1][1]==('O'))&&(board[2][2]==('O'))&&(board[3][3]==('O'))&&(board[4][4]==('O'))&&(board[5][5]==('O'))&&(board[6][6]==('O')))){
             System.out.println("Player 0 has won the game");
             endGame = 1;
         } 
     /**
      * Testing the second Diagonal
      */
        if(((board[0][6]==('X'))&&(board[1][5]==('X'))&&(board[2][4]==('X'))&&(board[3][3]==('X'))&&(board[4][2]==('X'))&&(board[5][1]==('X'))&&(board[6][0]==('X')))){
             System.out.println("Player X has won the game");
             endGame = 1;
         }
        if(((board[0][6]==('O'))&&(board[1][5]==('O'))&&(board[2][4]==('O'))&&(board[3][3]==('O'))&&(board[4][2]==('O'))&&(board[5][1]==('O'))&&(board[6][0]==('O')))){
             System.out.println("Player 0 has won the game");
             endGame = 1;
         }
     }
     }
     private void testing(int row,int column){
         while(1==1){
         if(((row)>(boardSize-1))||(row==0)||(column>(boardSize-1))||(column==0)){
             System.out.println("You have inputed a row or Column value which is out of the bounds 1-"+(boardSize-1));
             validation = 2;
             break;
         }
         if((board[row-1][column-1]=='X')||(board[row-1][column-1]=='O')){//test to see if a charicter already exists in the place stated 
             System.out.println("That space has already been taken ");
             validation = 2;
             break;
         }
         else{
             validation = 3;
             break;
         }
         }
     }

    /**
     * this Prints out the board 
     */
        private void writeBoard(){     
        writeBoardHeader();
        
        for (int row = 0; row < (boardSize-1); row++)
        {
            writeBoardRow(row);
            writeRowBoundary();
        }
    }
     
      private void writeBoardRow(int row)
    {
        System.out.print("| " + (row + 1) + " | ");
        for(int col = 0; col < (boardSize-1) ; col++)
        {
            System.out.print( board[row][col] + " | ");
        }
        System.out.println();
    }
    /**
     * ToDo
     */
    private void writeRowBoundary()
    {
        System.out.print("-----");
        for(int col = 0; col < (boardSize-1) ; col++)
        {
                System.out.print("----" );
        }
        System.out.println();
    }
    
    /**
     * ToDo
     */
    private void writeBoardHeader()
    {
        writeRowBoundary();
        
        System.out.print("|R\\C|"); 
        for (int col = 0; col < (boardSize-1); col++)
        {
            System.out.print(" " + (col+1) + " |");
        }    

        System.out.println(); 
        
        writeRowBoundary();
    }
    private void restBoard(){
        for(int row = 0;row<(boardSize-1);row++){
         for(int column = 0;column<(boardSize-1);column++){
             board[row][column]= ' ';
         }   
        }
    }
}
