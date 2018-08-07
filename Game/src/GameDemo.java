//program to implement the interface
public class GameDemo
{
 public static void perform(Game game) //perform takes the interface value
 {
	 game.play();  //invoke the play() method in the interface
 }
	public static void main(String[] args)
	{
		Game game[] = new Game[3];
		game[0] = new Cricket();
		game[1] = new Football();
		game[2] = new Tennis();
		
		perform(game[0]);
		perform(game[1]);
		perform(game[2]);
					
		
	}

}
