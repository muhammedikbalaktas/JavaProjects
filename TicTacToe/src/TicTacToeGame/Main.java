package TicTacToeGame;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		char [][]gameArea= {
				{'-','-','-'},
				{'-','-','-'},
				{'-','-','-'},
		};
		System.out.println("first player goes for X and second player goes for O");
		printResult(gameArea);
		int row_id;
		int col_id;
		while(true) {
			System.out.println("please enter row val for player 1 (0-2):");
			row_id=input.nextInt();
			System.out.println("please enter col val for player 1 (0-2):");
			col_id=input.nextInt();
			addForPlayerOne(gameArea,row_id,col_id);
			printResult(gameArea);
			
			if(checkForFirstPlayer(gameArea)) {
				System.out.println("Player one won the game");
				
				break;
			}
			System.out.println("please enter row val for player 2 (0-2):");
			row_id=input.nextInt();
			System.out.println("please enter col val for player 2 (0-2):");
			col_id=input.nextInt();
			addForPlayerTwo(gameArea,row_id,col_id);
			printResult(gameArea);
			
			if(checkForSecondPlayer(gameArea)) {
				System.out.println("Player two won the game");
				
				break;
			}
		}
		
		

	}
	static void addForPlayerOne(char[][]gameArea,int row_id,int col_id) {
		gameArea[row_id][col_id]='X';
		
	}
	static void addForPlayerTwo(char[][]gameArea,int row_id,int col_id) {
		gameArea[row_id][col_id]='O';
		
	}
	
	static boolean checkForFirstPlayer(char[][]gameArea) {
		char x='X';
		
		
			if(gameArea[0][0]==x) {
				if(gameArea[0][1]==x&gameArea[0][2]==x)return true;
				if(gameArea[1][0]==x&gameArea[2][0]==x)return true;
				if(gameArea[1][1]==x&gameArea[2][2]==x)return true;
			}
			if(gameArea[0][1]==x&gameArea[1][1]==x&gameArea[2][1]==x)return true;
			if(gameArea[0][2]==x) {
				if(gameArea[1][1]==x&gameArea[2][0]==x)return true;
				if(gameArea[1][2]==x&gameArea[2][2]==x)return true;
			}
		
		
		return false;
	}
	static boolean checkForSecondPlayer(char[][]gameArea) {
		char o='O';
			
		if(gameArea[0][0]==o) {
			if(gameArea[0][1]==o&gameArea[0][2]==o)return true;
			if(gameArea[1][0]==o&gameArea[2][0]==o)return true;
			if(gameArea[1][1]==o&gameArea[2][2]==o)return true;
		}
		if(gameArea[0][1]==o&gameArea[1][1]==o&gameArea[2][1]==o)return true;
		if(gameArea[0][2]==o) {
			if(gameArea[1][1]==o&gameArea[2][0]==o)return true;
			if(gameArea[1][2]==o&gameArea[2][2]==o)return true;
		}
		
		
		return false;
	}
	static void printResult(char gameArea[][]) {
		
		for(int i=0;i<3;i++) {
			
			for(int j=0;j<3;j++) {
				System.out.printf("%c ",gameArea[i][j]);
			}
			System.out.println("");
		}
		
	}

}
