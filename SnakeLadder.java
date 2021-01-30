public class SnakeLadder
{
	/* package codechef; // don't place package name! */
        static final int NO_PLAY=0;
        static final int LADDER=1;
        static final int SNAKE=2;
        static int position=0;

    public static void gameplay()
    {
        int dieValue=(int)(Math.floor(Math.random()*10 % 6) + 1);
        int choice=(int)Math.floor(Math.random()*10 % 4);
        switch(choice)
        {
            case NO_PLAY:
                System.out.println("Player did not move: "+ position);
		break;
            case LADDER:
                position=position+dieValue;
                System.out.println("Player position after climbing ladder: "+ position);
		break;
            case SNAKE:
                position=position-dieValue;
                if(position<0)
                {
                    position=0;
                }
                System.out.println("Player bit by snake: "+ position);
		break;
            default:
                System.out.println("Choose valid option");
                break;
        }
    }

    public static int simulateGame()
    {
        position=0;
        int totalDieRoll=0;
        while(position<100)
        {
		gameplay();
            	totalDieRoll++;
        }
        return totalDieRoll;
    }
	public static void twoPlayerGame()
	{
		System.out.println("For player 1:");
		int player1move=simulateGame();
		System.out.println("For player 2: ");
		int player2move=simulateGame();

		System.out.println("Number of die roll for player1: "+ player1move);
		System.out.println("Number of die roll for player2: "+ player2move);

		if(player1move < player2move)
		{
			System.out.println("player1 won the match");
		}else{
			System.out.println("player2 won the match");
		}
	}
        public static void main(String[] args)
        {
            SnakeLadder game=new SnakeLadder();
	   game.twoPlayerGame();

        }
}


