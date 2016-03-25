import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Game implements ActionListener {

	private JButton[][] board; // creates a board of disabled buttons to serve as the board
	private JButton[] buttons; // creates buttons that can be clicked to add the game pieces
	private int[][] counters; // each column gets a counter to keep track of the game pieces
	private int currentPlayer; // allows to switch between the players
	private int rows; 
	private int columns;
	public static final int MAX_ROWS = 20; // max amount of rows allowed
	public static final int MAX_COLUMNS = 20; // max amount of columns allowed
	
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
		this.buttons = new JButton[columns];
		this.board = new JButton[rows][columns];
		this.counters = new int[rows][columns];
		this.currentPlayer = 1;
		
		addCap();
		setupBoard();
	}
	
	/**
	 * sets up the frame, panel, button for board
	 * and the buttons iterate over how many columns
	 */
	private void setupBoard()
	{
		JFrame frame = new JFrame("Connect 4");
		JPanel panel = new JPanel(new GridLayout(rows + 1, columns));
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(500,500));
		frame.add(panel); // adds the JPanel to the JFrame
		
		for(int j = 0; j<columns; j++) // sets up the buttons that will be enabled to be clicked 
		{
			JButton pressed = new JButton();
			buttons[j] = pressed;
			panel.add(buttons[j]);
			buttons[j].addActionListener(this); // adds action listener to the enabled buttons
		}
		
		for(int i = 0; i<rows; i++) // sets up the buttons of the board that consists of disabled buttons
		{						
			for(int j = 0; j<columns; j++)
			{
				JButton button = new JButton();
				button.setEnabled(false);
				board[i][j] = button;
				panel.add(board[i][j]);
			}	
		}
		
		setupCounter();
		frame.pack();
	}
	
	/**
	 * sets up the counter for each column
	 * on the board to have an individual counter
	 * to keep track of which pieces have been placed
	 * on the boards
	 */
	private void setupCounter()
	{
		for(int i = 1; i<rows; i++) 
		{
			for(int j = 0; j<columns; j++)
			{
				counters[i][j] = j;
				counters[i][j] = i;
			}
		}
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
	 * prints the counter onto
	 * the console
	 */
	public void print()
	{
		
		for(int i = 1; i<rows; i++)
		{
			for(int j = 0; j<columns; j++)
			{
				System.out.print(counters[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	/**
	 * private method to allow player 1 and player 2 to
	 * switch and play turn by turn
	 */
	private void switchPlayer()
	{
		if(currentPlayer == 1)
		{
			currentPlayer = 0;
		}
		else
		{
			currentPlayer = 1;
		}
	}
	
	/**
	 * private method to add a limit to how
	 * big the board can get.  System will exit if 
	 * the numbers exceed that limit
	 */
	private void addCap()
	{
		if(rows >= MAX_ROWS || columns >= MAX_COLUMNS)
		{
			System.out.println("The number of rows and columns exceed the limit.");
			System.exit(0);
		}
	}
	
	/**
	 * Gives action when one of the enabled buttons has
	 * been pressed and drops down the pieces onto the board by setting 
	 * the disabled button to either black or red
	 * by default player 1 starts with the black piece
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
	int i = 1;
	for(int j = 0; j<buttons.length; j++)
		{
		if(buttons[j] == e.getSource())
		{	if(i<buttons.length)
			{
			try{ // handles when the row reaches the very last index 
				if(currentPlayer == 1)
				{
				board[rows - counters[i][j]][j].setBackground(Color.BLACK);
				counters[i][j]++;
				}
				
				else{
					board[rows-counters[i][j]][j].setBackground(Color.RED);
					counters[i][j]++;
				}
				switchPlayer();
			}
			catch(ArrayIndexOutOfBoundsException a)
			{
				System.out.println("error not enough space in the grid");
			}
			}
			
		}
		
			
		}
	
	
	
	}
	
	public static void main(String[] args)
	{
		Game one = new Game(12,12);
	}
	
	
}
