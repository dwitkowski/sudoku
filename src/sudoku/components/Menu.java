package sudoku.components;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;

public class Menu {
	
	public JMenuBar createMenuBar() {
		// Create menu bar.
		JMenuBar menuBar = new JMenuBar();
		
		// Create menus.
		JMenu fileMenu  = new JMenu("File");
		JMenu aboutMenu = new JMenu("About");
		
		// Create menu items.
		JMenuItem fileMenuNew    = new JMenuItem("New");
		JMenuItem fileMenuOpen   = new JMenuItem("Open...");
		JMenuItem fileMenuExit   = new JMenuItem("Exit");
		JMenuItem aboutMenuAbout = new JMenuItem("About Sudoku Solver");
		
		// Add the items to the menus.
		fileMenu.add(fileMenuNew);
		fileMenu.add(fileMenuOpen);
		fileMenu.add(fileMenuExit);
		aboutMenu.add(aboutMenuAbout);
		
		// Add the menu to the menu bar.
		menuBar.add(fileMenu);
		menuBar.add(aboutMenu);
		
		return menuBar;
	}
}
