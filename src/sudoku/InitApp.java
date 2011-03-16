package sudoku;
import sudoku.components.InitGUI;

public class InitApp {
	
	// Schedule a job for the "event-dispatching thread" to create and show the GUI.
	public static void run() {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				InitGUI.displayGUI();
			}
		});
	}
}
