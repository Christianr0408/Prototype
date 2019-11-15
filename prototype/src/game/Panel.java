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
import javax.swing.JPanel;

public class Panel extends JPanel implements KeyListener {

	
	public Panel() {
		addKeyListener(this);
		setBackground(new Color(255, 255, 255));
		setDoubleBuffered(true);
		setFocusable(true);
		
		repaint();
		
	}
	
	public void run() {
		repaint();
	}
	
	public void drawSplashPage(Graphics g) {
		g.setFont(new Font("Arial", Font.PLAIN, 100));
		g.setColor(new Color(0, 0, 0));
		g.drawString("The Closet App", 600, 100);
		g.drawRoundRect(300, 400, 300, 100, 75, 75);
		g.setColor(new Color(183, 16, 37));
		g.fillRoundRect(300, 400, 200, 100, 75, 75);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		drawSplashPage(g);

	}

	@Override
	public void keyPressed(KeyEvent k) {
	}

	@Override
	public void keyReleased(KeyEvent arg0) {}

	@Override
	public void keyTyped(KeyEvent arg0) {}
	
}
