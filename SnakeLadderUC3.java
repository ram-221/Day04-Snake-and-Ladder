package com.bridgelabday04;

public class SnakeLadderUC3 {		
		public static final int START = 0;
		public static final int NO_PLAY = 0;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int Position = 0;
			int Dies;
			int Condition;
			System.out.println("Starting position of Snake and Ladder is :" + START);
			Dies = (int) (Math.floor(Math.random() * 10 ) %6 ) + 1;	
			System.out.println("Dies is : " + Dies);
			Condition = (int) (Math.floor(Math.random() * 10 ) %3 );
			switch (Condition) {
			case 0:
				System.out.println("Its No Play player stays at same position" );
				System.out.println("Players position is : " + Position);
				break;
			case 1:
				System.out.println("Its ladder");
				Position += Dies;
				System.out.println("Players new position is : " + Position);
				break;
			case 2:
				System.out.println("Its snake");
				Position -= Dies;
				if(Position < 0) {
					Position = 0;
					System.out.println("Players new position is : " + Position);
				}
				else 
					System.out.println("Players new position is : " + Position);
				break;
			}
	}

}
