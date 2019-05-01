import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ConnectFourBoard extends JPanel implements ActionListener{
	private JButton [][] board;
	private static final int NUM_ROWS = 6;
	private static final int NUM_COLS = 7;
	
	public ConnectFourBoard(){
		setLayout(new GridLayout(6,7));
		displayBoard();
		
	}
	
	
	public void clearBoard() {
		for(int row=0; row<board.length; row++){
			for(int col=0; col<board[row].length; col++){
				board[row][col].setText("");
				board[row][col].setEnabled(true);
			}
		}
	}
	
	public void displayBoard() {
		board = new JButton[6][7];//initialize 2D array to 3x3 for ttt
		for(int row=0; row<board.length; row++){
			for(int col=0; col<board[row].length; col++){
				board[row][col] = new JButton("["+row+"]["+col+"]");
				board[row][col] = new JButton();
				Font bigF = new Font(Font.SANS_SERIF, Font.BOLD, 30);
				board[row][col].setFont(bigF);
				board[row][col].addActionListener(this);//listen for clicks
				board[row][col].setEnabled(true);//enable
				add(board[row][col]);
			}
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	

}
