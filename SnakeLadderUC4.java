package com.bridgelabday04;

public class SnakeLadderUC4 {

	
		
		public static final int START = 0;
		public static final int NO_PLAY = 0;
		public static final int LADDER = 1;
		public static final int SNAKE = 2;
		public static void main(String [] args){
			// TODO Auto-generated method stub
			
			int Position = 0;
			int Dies;
			int Condition;
			System.out.println("Starting position of Snake and Ladder is :" + START);
			while( Position < 100 ){
				Dies = (int) (Math.floor(Math.random() * 10 ) %6 ) + 1;	
				System.out.println("Player got : " + Dies);
				Condition = (int) (Math.floor(Math.random() * 10 ) %3 );

				switch (Condition) {
				case 0:
					System.out.println("Its No Play player stays at same position");
					break;
				case 1:
					System.out.println("Its ladder");
					Position += Dies;
					break;
				case 2:		
					System.out.println("Its snake");
					Position -= Dies;
					if(Position < 0)
						Position = 0;
					break;
				}
				System.out.println("players position is : " + Position);
				System.out.println("\n");
			}
			System.out.println("!!!!! Yeh Player is won !!!!! ");
	}

}
