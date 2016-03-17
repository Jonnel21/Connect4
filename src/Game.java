import java.awt.*;
import javax.swing.*;
public class Game {

	private int[][] board = new int[0][0];
	private int rows;
	private int columns;
	private JButton[] buttons; // instantiate an array of buttons
	public Game()
	{
		
	}
	
	/**
	 * creates a board with a number
	 * of rows and columns
	 * @param rows
	 * @param columns
	 */
	public Game(int rows, int columns)
	{
		this.rows = rows;
		this.columns = columns;
		board = new int[this.rows][this.columns];
		setupBoard();
	}
	
	/**
	 * sets up the frame, panel, button for board
	 * and the buttons iterate over how many columns
	 */
	public void setupBoard()
	{
		JFrame frame = new JFrame();
		JPanel panel = new JPanel(new FlowLayout());
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(800,400);
		frame.add(panel); // adds the JPanel to the JFrame
		
		buttons = new JButton[columns];
		for(int i = 0; i<columns; i++)
		{
			buttons[i] = new JButton();
			panel.add(buttons[i]);
		}
		
		panel.setBackground(Color.YELLOW); //set the background to yellow
	}
	
	/**
	 * gets the number of rows of the board
	 * @return int of rows
	 */
	public int getRows()
	{
		return this.rows;
	}
	
	/**
	 * gets the number of columns of the board
	 * @return int of columns
	 */
	public int getColumns()
	{
		return this.columns;
	}
	
	/**
	 * prints the current board onto
	 * the console
	 */
	public void print()
	{
		for(int i = 0; i<this.rows; i++)
		{
			for(int j = 0; j<this.columns; j++)
			{
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		Game one = new Game(10,10);
		System.out.print(one.getRows() + "x");
		System.out.println(one.getColumns());
		one.print();
	}

}
