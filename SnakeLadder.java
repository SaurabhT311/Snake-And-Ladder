public class SnakeLadder
{
	public static void main(String[] args)
	{
		int position=0;
		System.out.println("Game starting in single player mode");
		int dieValue=(int)(Math.floor(Math.random()*10 % 6) + 1);
		System.out.println("Die value is :" +dieValue);
	}
}
