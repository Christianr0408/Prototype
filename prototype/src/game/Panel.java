package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel extends JPanel implements KeyListener {

	String screenTracker;
	
	
	String[] screenList = {"title_screen", "select_screen"};
	
	public Panel() {
		addKeyListener(this);
		setBackground(new Color(255, 255, 255));
		setDoubleBuffered(true);
		setFocusable(true);
		screenTracker = "title_screen";
		repaint();
		
	}
	
	public void run() {
		repaint();
	}
	
	public void drawLoadingScreen(Graphics g) {
		g.setFont(new Font("Arial", Font.PLAIN, 100));
		g.setColor(new Color(0, 0, 0));
		g.drawString("The Closet App", 600, 100);
		
		
		g.setColor(new Color(183, 16, 37));
		g.setFont(new Font("Arial", Font.PLAIN, 35));
		g.drawString("Loading...", 770, 440);
		g.drawRect(770, 450, 350, 50);
		g.fillRect(770, 450, 250, 50);
	}
	
	public void drawSplashPage(Graphics g) {
		g.setFont(new Font("Arial", Font.PLAIN, 100));
		g.setColor(new Color(0, 0, 0));
		g.drawString("The Closet App", 600, 100);
		g.setColor(new Color(183, 16, 37));
		g.fillRoundRect(450, 700, 200, 100, 75, 75);
		
		
		g.fillRoundRect(850, 700, 200, 100, 75, 75);
		g.fillRoundRect(1250, 700, 200, 100, 75, 75);
		g.setColor(new Color(255,255,255));
		
		g.setFont(new Font("Arial", Font.PLAIN, 35));
		g.drawString("New Outfit", 470, 760);
		g.drawString("Saved Outfits", 850, 760);
		g.drawString("Settings", 1285, 760);
		
		g.drawImage(new ImageIcon("src/pictures/hanger.png").getImage(), 800, 300, 300, 200, null);
		
		
	}
	public void drawSecondPage(Graphics g) {
		g.setColor(Color.BLACK);
		setBackground(new Color(255, 255, 255));
		g.setFont(new Font("Arial", Font.PLAIN, 100));
		g.setColor(new Color(0, 0, 0));
		g.drawString("New Outfit", 700, 100);
	
		
		g.setColor(new Color(183, 16, 37));
		g.fillRoundRect(450, 700, 200, 100, 75, 75);
		g.fillRoundRect(850, 700, 200, 100, 75, 75);
		g.fillRoundRect(1250, 700, 200, 100, 75, 75);
		g.setColor(new Color(255,255,255));
		g.setFont(new Font("Arial", Font.PLAIN, 33));
		g.drawString("Randomize", 470, 750);
		g.drawString("Outfit", 510, 780);
		g.drawString("Saved Outfits", 850, 760);
		g.drawString("Menu", 1310, 760);
		
		g.drawImage(new ImageIcon("src/pictures/closet.png").getImage(), 800, 200, 400, 400, null);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		drawLoadingScreen(g);
		/*if (screenTracker.contentEquals("title_screen"))
			drawSplashPage(g);
		else
			drawSecondPage(g);
		*/
	}

	@Override
	public void keyPressed(KeyEvent k) {
		
		if(k.getKeyCode()==KeyEvent.VK_ENTER) {
			screenTracker="selection_screen";
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {}

	@Override
	public void keyTyped(KeyEvent arg0) {}
	
}
