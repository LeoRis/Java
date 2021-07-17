package src;

import javax.swing.JFrame;

public class GameFrame extends JFrame {

	GameFrame(){
		
		// GamePanel panel = new GamePanel();
		// this.add(panel);		==> Both lines are exactly the same with the code bellow.
		
		this.add(new GamePanel()); // Shortcut to the code above.
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		
	}
}
