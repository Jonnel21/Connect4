import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Game implements ActionListener{

	private JButton[][] board = new JButton[0][0];
	private JButton[] buttons;
	private int rows;
	private int columns;
	
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
		buttons = new JButton[this.columns];
		board = new JButton[this.rows][this.columns];
		
		setupBoard();
	}
	
	/**
	 * sets up the frame, panel, button for board
	 * and the buttons iterate over how many columns
	 */
	public void setupBoard()
	{
		JFrame frame = new JFrame();
		JPanel panel = new JPanel(new GridLayout(this.rows +1, this.columns));
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.add(panel); // adds the JPanel to the JFrame
		panel.setSize(500,500);
		
		for(int j = 0; j<this.columns; j++) // sets up the buttons that will be enabled to be clicked 
		{
			JButton pressed = new JButton();
			buttons[j] = pressed;
			panel.add(buttons[j]);
			buttons[j].addActionListener(this); // adds action listener to the enabled buttons
		}
		
		for(int i = 0; i<rows; i++) // sets up the buttons of the board that is disabled
		{						
			for(int j = 0; j<columns; j++)
			{
				JButton button = new JButton();
				button.setEnabled(false);
				board[i][j] = button;
				panel.add(board[i][j]);
				
			}	
		}
		
		frame.pack();
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
	
	/**
	 * The enabled buttons will be pressed
	 * and  should register to the console and print
	 * out Pressed..
	 */
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
		System.out.println("Pressed..");
		
	}

	
	public static void main(String[] args)
	{
		Game one = new Game(10,10); // creates a new board of size 10x10
		
	}

	
}
