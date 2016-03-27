
public class Tester 
{
	public static void main(String[] args)
	{
		
		
		String boardSize = args[0];
		String numToWin = args[1];
		Game g = new Game(Integer.parseInt(boardSize), Integer.parseInt(numToWin));
		
		//Game g = new Game(5,5,4);
		//g.print();
		
	}

}
