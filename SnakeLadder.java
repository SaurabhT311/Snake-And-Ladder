public class SnakeLadder
{
        static final int NO_PLAY=0;
        static final int LADDER=1;
        static final int SNAKE=2;

        public static void main(String[] args)
        {
                int position=0;
		int totalDieRoll=0;
                System.out.println("Game starting in single player mode");
                while(position!=100) //loop will run till position hits to the 100
		{
			int dieValue=(int)(Math.floor(Math.random()*10 % 6) + 1);
			int choice=(int)Math.floor(Math.random()*10 % 3);
                	switch(choice) //implementing switch case 
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
					if(position<0) //if position is less than 0 then position will initialise to 0
					{
						position=0;
					}
                                	System.out.println("Player bit by snake: "+ position);
                               		 break;
                        	default:
                                	System.out.println("Choose valid option");
                                	break;
               		 }//end of switch
			totalDieRoll++; //incrementing totalDieRoll by each instance
		}//end of while
			System.out.println("Total number of die rolls is: "+ totalDieRoll);
			System.out.println("Player reached at position "+ position + " and won the game"); 
         }//end of main        
}//end of class


