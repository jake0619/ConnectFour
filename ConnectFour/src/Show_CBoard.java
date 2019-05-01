

public class Show_CBoard {

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater( new Runnable(){
			@Override
			public void run() {

				ConnectFourGui gui = new ConnectFourGui();
			}
		} );
	}

}