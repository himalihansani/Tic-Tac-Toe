/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical_04;

import java.util.Random;

/**
 *
 * @author csc2017
 */
public class TicTacToe {
    private char[][] board=new char[3][3];
//    private char currentPlayerMark;
    private int count = 0;

    public TicTacToe(char currentPlayerMark) {
//        this.currentPlayerMark = currentPlayerMark;
    }
  
//    public void changeTheMark(){
//        if(currentPlayerMark=='X')
//            currentPlayerMark='O';
//        else
//            currentPlayerMark='X';
//    }
    public char getPlayerMark(int count){
        if(count % 2 == 0)
            return 'X';
        else
            return 'O';
    }
    public void set(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                board[i][j]='-';
            }
        }
    }
    
    public void printTheBoard(){
        for(int i=0;i<3;i++){
               System.out.println("__________________________________________");
               System.out.printf("|   %c   |    %c      |    %c     |\n",board[i][0],board[i][1],board[i][2]);
        }  
        System.out.printf("\n\n");
    }
    
    public void checkTheFull(){
        if((board[0][0]!='-')&&(board[0][1]!='-')&&(board[0][2]!='-')&&(board[1][0]!='-')&&(board[1][1]!='-')&&(board[1][2]!='-')&&(board[2][0]!='-')&&(board[2][1]!='-')&&(board[2][2]!='-'))
            System.out.println("The board is full");
    }
    
    public int placeTheMark(int num){
        int i=0,j=0;
        switch(num){
            case 1:
                i=0;j=0;break;
            case 2:
                i=0;j=1;break;
            case 3:
                i=0;j=2;break;
            case 4:
                i=1;j=0;break;
            case 5:
                i=1;j=1;break;
            case 6:
                i=1;j=2;break;
            case 7:
                i=2;j=0;break;
            case 8:
                i=2;j=1;break;
            case 9:
                i=2;j=2;break;
        }
        
        if( board[i][j] == '-'){
            board[i][j]=getPlayerMark(++this.count);
            return 1;
        }
        return -1;
            
    }
    
    public void placeByMachine(){
        Random r=new Random();
        int i=r.nextInt(3);
        int j=r.nextInt(3);

        board[i][j]=currentPlayerMark;
    }
    
    public char checkTheWinner(){
        for(int i=0;i<3;i++){
            if((board[i][0]==board[i][1])&&(board[i][1]==board[i][2])&&(board[i][1]==currentPlayerMark))
                return currentPlayerMark;    
        }
        
        for(int j=0;j<3;j++){
            if((board[0][j]==board[1][j])&&(board[1][j]==board[2][j])&&(board[1][j]==currentPlayerMark))
                return currentPlayerMark;     
        }
        
        if((board[0][0]==board[1][1])&&(board[1][1]==board[2][2])&&(board[1][1]==currentPlayerMark))
            return currentPlayerMark; 
        
        if((board[0][2]==board[1][1])&&(board[1][1]==board[2][0])&&(board[1][1]==currentPlayerMark))
            return currentPlayerMark; 
        
        else 
            return 'N';
    }
}
