/***************************************************
*	A tic tac toe game for 2 players
*	Made as a test and uses 1 class
****************************************************/

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) 
	{
		boolean win = false;
		int turn=0,x=0,y=0;
		Scanner input = new Scanner(System.in);
		Board field = new Board();
		while (win==false)
		{
			if((turn%2)==0)
			{
				System.out.println("enter coordinates p1");
				x=input.nextInt();
				y=input.nextInt();
				field.playerOne(x, y);

			}
			if((turn%2)==1)
			{
				System.out.println("enter coordinates p2");
				 x=input.nextInt();
				 y=input.nextInt();
				 field.playerTwo(x, y);
			}
			field.dispBoard();
			
			if (field.winner()=='1')
			{
				win=true;
				System.out.println("--==player one wins!!!==--");
			}
			if (field.winner()=='2')
			{
				win=true;
				System.out.println("--==player two wins!!!==--");
			}
			if (turn==8)
			{
				win=true;
				System.out.println("\n--==Cat Game! No winner==--");
			}
			
			turn++;
			
		}
		input.close();
	}

}
