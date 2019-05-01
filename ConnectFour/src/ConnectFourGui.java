import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ConnectFourGui extends JFrame{	
	
	private JPanel jpMain;
	//Player player1;
	//Player player2;
	//Player currPlayer;
	ConnectFourBoard cfourBoard;
	//Scoreboard scoreboard;
	
	public ConnectFourGui()	{
		jpMain = new JPanel();
		jpMain.setLayout(new BorderLayout());
		cfourBoard = new ConnectFourBoard();
		jpMain.add(cfourBoard, BorderLayout.CENTER);
		add(jpMain);
		setSize(1000,500);
		//pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
}
