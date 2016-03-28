
public class Tester 
{
	public static void main(String[] args)
	{
<<<<<<< HEAD
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
=======
		
		  if(args.length != 2) {
	            System.out.println("Invalid number of arguments");
	            System.out.println("Usage: [ rows/columns | win count ]");
	            System.out.println("rows/columns: Number of rows and columns, x by x");
	            System.out.println("win count: number of pieces to connect require to win");
	            return;
	        }
		String rowsAndColumns = args[0];
		String numToWin = args[1];
		Game g = new Game(Integer.parseInt(rowsAndColumns), Integer.parseInt(numToWin));
		
		
>>>>>>> 1c1dc8535039d2eab83b69265b5bd007aef75b91
	}

}
