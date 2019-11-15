package game;

import javax.swing.JFrame;

public class Application extends JFrame {
	Panel panel;
	
	public Application() {
		setSize(800, 800);
		setTitle("The Closet App");
		
		panel = new Panel();
		add(panel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		repaint();
		setLocationRelativeTo(null);
	}
	
	public void run() {
		panel.run();
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Application app = new Application();
		app.setVisible(true);
		while(true)
			app.run();
	}
}
