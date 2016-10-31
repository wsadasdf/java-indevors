/***************************************
*	contains most the logic for 
*	running the game
****************************************/

import java.util.Scanner;

public class Board
{
	private char[][] board=new char[3][3];//instance variable(s)
	
	public Board()
	{
		for (int i=0;i<3;i++)
			for (int j=0;j<3;++j)
				board[i][j]='_';
	}
	
	public void dispBoard()
	{
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<3;++j)
			{
				System.out.print(board[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void playerOne(int x, int y)//sets x where player one wants
	{@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		boolean good=true;
		while(good)
		{
			if ((x>3)||(x<1)||(y>3)||(y<1))
			{
				System.out.println("Invalid input. enter proper coordinates");
				x=input.nextInt();
				y=input.nextInt();
			}
			else if((board[x-1][y-1]=='_'))
			{
				board[x-1][y-1]='X';
				good=false;
			}
			else
			{
				System.out.println("Spot taken. enter empty coordinates");
				x=input.nextInt();
				y=input.nextInt();
			}
		}
	}
	
	public void playerTwo(int x, int y)//sets  o where player wants
	{@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		boolean good=true;
		while(good)
		{
			if ((x>3)||(x<1)||(y>3)||(y<1))
			{
				System.out.println("Invalid input. enter proper coordinates");
				x=input.nextInt();
				y=input.nextInt();
			}
			else if(board[x-1][y-1]=='_')
			{
				board[x-1][y-1]='O';
				good=false;
			}
			else
			{
				System.out.println("Spot taken. enter empty coordinates");
				x=input.nextInt();
				y=input.nextInt();
			}
		}
	}
	
	public char winner()//check for a winner and returns who won (8 different conditions)
	{
		char winner='n';
		if((board[0][0]==board[1][0])&&(board[0][0]==board[2][0]))//check vert win 1st row
			if(board[0][0]=='X')
				winner='1';
			else if(board[0][0]=='O')
				winner = '2';
			else
				winner='n';
		if((board[0][1]==board[1][1])&&(board[0][1]==board[2][1]))//check vert win 2nd row
			if(board[0][1]=='X')
				winner='1';
			else if(board[0][1]=='O')
				winner = '2';
			else
				winner='n';
		if((board[0][2]==board[1][2])&&(board[0][2]==board[2][2]))//check vert win 3rd row
			if(board[0][2]=='X')
				winner='1';
			else if(board[0][2]=='O')
				winner = '2';
			else
				winner='n';
		if((board[0][0]==board[0][1])&&(board[0][0]==board[0][2]))//check horiz win 1st column
			if(board[0][0]=='X')
				winner='1';
			else if(board[0][0]=='O')
				winner = '2';
			else
				winner='n';
		if((board[1][0]==board[1][1])&&(board[1][0]==board[1][2]))//check horiz win 2nd column
			if(board[1][0]=='X')
				winner='1';
			else if(board[1][0]=='O')
				winner = '2';
			else
				winner='n';
		if((board[2][0]==board[2][1])&&(board[2][0]==board[2][2]))//check horiz win 3rd column
			if(board[2][0]=='X')
				winner='1';
			else if(board[2][0]=='O')
				winner = '2';
			else
				winner='n';
		if((board[0][0]==board[1][1])&&(board[0][0]==board[2][2]))//check diag win 0,0
			if(board[0][0]=='X')
				winner='1';
			else if(board[0][0]=='O')
				winner = '2';
			else
				winner='n';
		if((board[2][0]==board[1][1])&&(board[2][0]==board[0][2]))//check diag win 2,0
			if(board[2][0]=='X')
				winner='1';
			else if(board[2][0]=='O')
				winner = '2';
			else
				winner='n';	
		return winner;
		
	}//end of winner
}
