import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tester_1
{
	private static MyButton[][] buttons = new MyButton[10][10];
	//private static JPanel panel;
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		JPanel panel = new JPanel(new GridLayout(6,6));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 700);
		frame.add(panel);
		//panel.setBackground(Color.YELLOW);
		
		for(int i = 0; i < 6; i++)
		{
			for(int j = 0; j < 6; j++)
			{
			MyButton button = new MyButton();
			buttons[i][j] = button;
			button.setBackground(Color.BLUE);
			button.setEnabled(true);
			button.setBorderPainted(false);
			panel.add(buttons[i][j]);
			}
		}
		frame.pack();
		//System.out.println(buttons[0].get);
		
		
	}
	
}
