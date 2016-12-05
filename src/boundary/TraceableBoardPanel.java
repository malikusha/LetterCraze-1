package boundary;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

import controllers.TileDragController;
import controllers.TileReleaseController;
import controllers.TileToggleController;

import java.awt.Color;

public class TraceableBoardPanel extends JPanel {

	JToggleButton[] buttons;
	JLabel[] arrows;

	/**
	 * Create the application.
	 */
	public TraceableBoardPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {	
		
		setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 900, 900);
		add(layeredPane);
		
		/*
		JPanel panel = new JPanel();
		panel.setBackground(Color.MAGENTA);
		panel.setBounds(0, 0, 800, 800);
		add(panel);
		panel.setLayout(null);
		*/
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.MAGENTA);
		panel.setBounds(0, 0, 800, 800);
		panel.setLayout(null);
		layeredPane.setLayer(panel, 1);
		layeredPane.add(panel);
		
		buttons = new JToggleButton[36];
		for (int i = 0; i < 36; i++){
			buttons[i] = new JToggleButton("");
			int x_pos = 100 + 100 * (i % 6);
			int y_pos = 100 + 100 * (i / 6);
			buttons[i].setBounds(x_pos, y_pos, 100, 100);
			panel.add(buttons[i]);
		}
		
		arrows = new JLabel[85];
		for (int i = 0; i < 30; i++){
			arrows[i] = new JLabel("O");
			int x_pos = 185 + 100 * (i % 5);
			int y_pos = 130 + 100 * (i / 5);				
			arrows[i].setBounds(x_pos, y_pos, 32, 30);
			layeredPane.setLayer(arrows[i], 0);
			layeredPane.add(arrows[i]);
		}
		for (int i = 0; i < 55; i++){
			arrows[30 + i] = new JLabel("O");
			int x_pos = 135 + 50 * (i % 11);
			int y_pos = 180 + 100 * (i / 11);	
			arrows[30 + i].setBounds(x_pos, y_pos, 32, 30);
			layeredPane.setLayer(arrows[30 + i], 0);
			layeredPane.add(arrows[30 + i]);
		}
		
		panel.addMouseMotionListener(new TileDragController(panel, layeredPane, arrows));
		panel.addMouseListener(new TileReleaseController(panel, layeredPane, arrows));
		
		for (int i = 0; i < 36; i++){
			buttons[i].addMouseMotionListener(new TileToggleController(panel));
			buttons[i].addMouseListener(new TileReleaseController(panel, layeredPane, arrows));
		}	
	}
}