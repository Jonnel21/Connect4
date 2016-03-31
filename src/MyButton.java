import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Paint;
import java.awt.PaintContext;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.ColorModel;

import javax.swing.JButton;

public class MyButton extends JButton 
{
	private Color color = Color.WHITE;
	
	public MyButton()
	{
		super();
		setPreferredSize(new Dimension (68 , 65));
		//addActionListener(this);
	}
	
	public void paintComponent(Graphics g)
	{
		
		super.paintComponent(g);
		Graphics2D ga = (Graphics2D) g;
		//ga.setPaint(new GradientPaint(new Point(0,0), Color.WHITE, new Point(0, getHeight()), this.white));
		ga.setPaint(this.color);
		ga.fillOval(getHorizontalAlignment(), getVerticalAlignment(), getWidth()-10, getHeight()-10);
	}
	
	public Color getColor()
	{
		return this.color;
	}
	
	public void setBackground(Color c)
	{
		super.setBackground(c);
		
	}
	
	public void setColor(Color c)
	{
		this.color = c;
		this.repaint();
	}
	
}
