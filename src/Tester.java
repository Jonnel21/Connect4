
public class Tester 
{
	public static void main(String[] args)
	{
		if(args.length != 2) {
            System.out.println("Invalid number of arguments");
            System.out.println("Usage: [ rows/columns | win count ]");
            System.out.println("rows/columns: Number of rows and columns, x by y");
            System.out.println("win count: number of pieces to connect required to win");
            return;
        }
		String rowsAndColumns = args[0];
		String numToWin = args[1];
		Game g = new Game(Integer.parseInt(rowsAndColumns), Integer.parseInt(numToWin));
	}

}
