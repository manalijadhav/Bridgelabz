package com.strings.n.arrays;
import java.util.Scanner;
class c
{
	public static void draw(char mat[][],char player,char computer)//printing matrix for game
	{
		for(int i=0;i<3;i++) 
		{
			for(int j=0;j<3;j++)
			{
			System.out.print(mat[i][j]+"|");	
	
			}
			System.out.println();
			System.out.println("_|_|_");
		}
	}
	public static void input(char mat[][],char player,char computer)
	
	{
		System.out.println(player+" for player");
		System.out.println(computer+ " for computer");
		int count=1;
		Scanner s=new Scanner(System.in);
		while(count<=9)
		{
			if(count % 2 !=0)// if count is even player turn
			{
				System.out.println("player turn,\n Enter ur choice");
				while(count %2 != 0)// travel upto user not enter correct value
				{
			     char n=s.next().charAt(0);
			     
			     for(int i = 0; i < 3; i++) 
			      {
				   for(int j = 0; j < 3; j++)
				   {
					  if(n == mat[i][j])
					   {
				          mat[i][j] = player;
				          count++;
				       }
				    }
			        }
			      }
		    }
		      if(count % 2 == 0)
				  {
		          while(count % 2 == 0)
					{
				    int n1=(int)(Math.random()*8+1);
					char c = (char)(n1+'0');
					//Here, we used '0' because chars are actually represented by ASCII values.
					//'0' is a char and represented by the value of 48.
					 System.out.println(c);
				    for(int i=0;i<3;i++) 
					  {
						  for(int j=0;j<3;j++)
						  {
					        if(c == mat[i][j])
					         {
						     mat[i][j] = computer;
						      count++;
					          }
				            }
			            }
				       }
				}
		   draw(mat,player,computer);
		   char win=checkwin(mat,player,computer,count);
		    if(win==player)
		    { 
			System.out.println("player win");
			break;
		    }
		    if(win==computer)
		    {
			System.out.println("computer win");
			break;
		    }
		    }
	}
	
	public static char checkwin(char mat[][],char player,char computer,int count)// check wining condition
	{
		if(mat[0][0]==player&&mat[0][1]==player&&mat[0][2]==player)
		{
			return player;
			
		}
		if(mat[1][0]==player && mat[1][1]==player &&mat[1][2]==player)
		{
			return player;
		}
		if(mat[2][0]==player&&mat[2][1]== player&& mat[2][2]== player )
		{
			return player;
		}
		if(mat[0][0]==computer&&mat[0][1]==computer&&mat[0][2]==computer)
		{
			return computer;
		}
		if(mat[1][0]==computer&&mat[1][1]==computer&&mat[1][2]==computer)
		{
			return computer;
		}
		if(mat[2][0]==computer&&mat[2][1]==computer&&mat[2][2]==computer)
		{
			return computer;
		}
		if(mat[0][0]==player&&mat[1][0]==player&&mat[2][0]==player)
		{
			return player;
			
		}
		if(mat[0][1]==player&&mat[1][1]== player&& mat[2][1]== player )
		{
			return player;
		}
		if(mat[0][2]==player && mat[1][2]==player &&mat[2][2]==player)
		{
			return player;
		}
		
		if(mat[0][0]==computer&&mat[1][0]==computer&&mat[2][0]==computer)
		{
			return computer;
		}
		if(mat[0][1]==computer&&mat[1][1]==computer&&mat[2][1]==computer)
		{
			return computer;
		}
		if(mat[0][2]==computer&&mat[1][2]==computer&&mat[2][2]==computer)
		{
			return computer;
		}
		if(mat[0][0]==player&&mat[1][1]==player&&mat[2][2]==player)
		{
			return player;
		}
		if(mat[0][0]==computer && mat[1][1]==computer && mat[2][2]==computer)
		{
			return computer;
		}
		if(mat[0][2]==computer && mat[1][1]==computer && mat[2][0]==computer)
		{
			return computer;
		}
		if(mat[0][2]==player && mat[1][1]==player && mat[2][0]==player)
		{
			return player;
		}
		if(count==9)
		{
		return 'd';
		}
		return 'b';
	}
}
public class TicTacToe {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		char[][] mat= {{'1','2','3'},{'4','5','6'},{'7','8','9'}};// for ease we define already put value
		char player,computer;
		System.out.println(" player enter ur choice from 'o'&'x'");// ask for user for "O" and "X"
		player=s.next().charAt(0);//To read a char, we use next().charAt(0). 
		                          //next() function returns the next token/word in the input as a string 
		                         //and charAt(0) function returns the first character in that string.
		if(player=='x')
		{
			computer='o';
		}
		else
			computer='x';
		
		c.draw(mat,player,computer);// pass input for printing
		c.input(mat,player,computer);// pass input for starting game
	}
}
