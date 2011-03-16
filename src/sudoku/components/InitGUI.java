package sudoku.components;
import javax.swing.JFrame;

public class InitGUI {
	
	private static JFrame frame;
	
	// Takes care of putting together the swing frame and components
	// and then displaying it to the screen.
	public static void displayGUI() {
		
		// Create and set new window.
		createFrame();
		
		// Create and set window content.
		createContentPane();
		
		// Set and display window.
		displayFrame();
	}
	
	private static void createFrame() {
		// Create new window.
		frame = new JFrame("Sudoku Solver");
		// What happens when the frame closes?
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private static void createContentPane() {
		// Add menu bar.
		Menu appMenu = new Menu();
		frame.setJMenuBar(appMenu.createMenuBar());
	}
		
	private static void displayFrame() {
		frame.pack();
		frame.setSize(600, 600);	
		frame.setVisible(true);
	}
}