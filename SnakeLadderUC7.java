package com.bridgelabday04;

public class SnakeLadderUC7 {

	
		public static final int START = 0;
		public static final int NO_PLAY = 0;
		public static final int LADDER = 1;
		public static final int SNAKE = 2;
		
		public static void main(String [] args){
			int position1 = 0;
			int position2 = 0;
			int counter = 0;
			int turn = 0;
			int oldturn = 0;
			int Dies;
			int Condition;
			System.out.println("Starting position of Snake and Ladder is :" + START);
			while( position1 < 100 && position2 < 100){
				if( turn == 0 )
					System.out.println("Player 1 is playing");
				else
					System.out.println("Player 2 is playing");
				Dies = (int) (Math.floor(Math.random() * 10 ) % 6 ) + 1;	
				System.out.println("Player got : " + Dies);
				Condition = (int) (Math.floor(Math.random() * 10 ) %3 );

				switch (Condition)
				{
				case 0:
					System.out.println("Its No Play player stays at same position. ");
					break;
				case 1:
					System.out.println("Its  ladder. ");
					if(turn == 0)
						position1 += Dies;
					else
						position2 += Dies;
					if(position1 > 100) {
						position1 -= Dies;
						System.out.println("Position of player 1 is exceding so not counting " );
					}
					if(position2 > 100){
						position2 -= Dies;
						System.out.println(" Position of player 2 is exceding so not counting  " );
					}
					turn += 1;
					break;
				case 2:		
					System.out.println("Its snake. ");
					if(turn == 0)
						position1 -= Dies;
					else
						position2 -= Dies;
					if(position1 < 0) 
						position1 = 0;
					if(position2 < 0) 
						position2 = 0;
					break;
				}
				counter++;
				turn = (turn + 1 ) %2;
				if(oldturn == 0)
					System.out.println("Position of player 1 is : " + position1);
				else
					System.out.println("Position of player 2 is : " + position2);
				oldturn = turn;	
				System.out.println("\n");
			}
			System.out.println("Number of dies is rolled : " + counter);
			System.out.println("!!!!! Yeh Player "+ (turn + 1) + " is won !!!!! ");
	}

}
