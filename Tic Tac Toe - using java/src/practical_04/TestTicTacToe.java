/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical_04;
import java.util.Scanner;
/**
 *
 * @author csc2017
 */
public class TestTicTacToe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int turn=1;
        Scanner input=new Scanner(System.in);
        

        TicTacToe board=new TicTacToe('X');
        board.set();
        
        while((board.checkTheWinner()!='O')||(board.checkTheWinner()!='X')){
        if(turn==1){   
        System.out.println("Enter a value");
        int x=input.nextInt();
            board.placeTheMark(x);
            turn=2;
        }
        else if(turn==2){
            board.placeByMachine();
            turn=1;
        }
        
        board.printTheBoard();
        
        }
    }
    
}
