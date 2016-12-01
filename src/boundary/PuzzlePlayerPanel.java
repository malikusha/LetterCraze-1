package boundary;
import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

import controllers.ToMainMenuController;
import model.Model;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JToggleButton;
import javax.swing.ImageIcon;

public class PuzzlePlayerPanel extends JPanel {
	
	private Application a;
	private Model m;
	
	private JButton btnMainMenu;
	
	public PuzzlePlayerPanel(Application a, Model m){
		this.a = a;
		this.m = m;
		initialize();
	}
	
	public void initialize() {
		initializeViews();
		initializeControllers();
	}
	
	public void initializeViews() {
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(10, 11, 434, 361);
		add(panel);

		btnMainMenu = new JButton("MAIN MENU");
		btnMainMenu.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		btnMainMenu.setBounds(231, 11, 193, 35);
		panel.add(btnMainMenu);

		JLabel label = new JLabel("LEVEL 1");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Comic Sans MS", Font.BOLD, 28));
		label.setBounds(10, 11, 114, 35);
		panel.add(label);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 57, 293, 294);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(6, 6, 0, 0));

		JToggleButton toggleButton = new JToggleButton("A");
		toggleButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		panel_1.add(toggleButton);

		JToggleButton toggleButton_1 = new JToggleButton("A");
		toggleButton_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		panel_1.add(toggleButton_1);

		JToggleButton toggleButton_2 = new JToggleButton("A");
		toggleButton_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		panel_1.add(toggleButton_2);

		JToggleButton toggleButton_3 = new JToggleButton("A");
		toggleButton_3.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		panel_1.add(toggleButton_3);

		JToggleButton toggleButton_4 = new JToggleButton("A");
		toggleButton_4.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		panel_1.add(toggleButton_4);

		JToggleButton toggleButton_5 = new JToggleButton("A");
		toggleButton_5.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		panel_1.add(toggleButton_5);

		JToggleButton toggleButton_6 = new JToggleButton("A");
		toggleButton_6.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		panel_1.add(toggleButton_6);

		JToggleButton toggleButton_7 = new JToggleButton("A");
		toggleButton_7.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		panel_1.add(toggleButton_7);

		JToggleButton toggleButton_8 = new JToggleButton("A");
		toggleButton_8.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		panel_1.add(toggleButton_8);

		JToggleButton toggleButton_9 = new JToggleButton("A");
		toggleButton_9.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		panel_1.add(toggleButton_9);

		JToggleButton toggleButton_10 = new JToggleButton("A");
		toggleButton_10.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		panel_1.add(toggleButton_10);

		JToggleButton toggleButton_11 = new JToggleButton("A");
		toggleButton_11.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		panel_1.add(toggleButton_11);

		JToggleButton toggleButton_12 = new JToggleButton("A");
		toggleButton_12.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		panel_1.add(toggleButton_12);

		JToggleButton toggleButton_13 = new JToggleButton("A");
		toggleButton_13.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		panel_1.add(toggleButton_13);

		JToggleButton toggleButton_14 = new JToggleButton("A");
		toggleButton_14.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		panel_1.add(toggleButton_14);

		JToggleButton toggleButton_15 = new JToggleButton("A");
		toggleButton_15.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		panel_1.add(toggleButton_15);

		JToggleButton toggleButton_16 = new JToggleButton("A");
		toggleButton_16.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		panel_1.add(toggleButton_16);

		JToggleButton toggleButton_17 = new JToggleButton("A");
		toggleButton_17.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		panel_1.add(toggleButton_17);

		JToggleButton toggleButton_18 = new JToggleButton("A");
		toggleButton_18.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		panel_1.add(toggleButton_18);

		JToggleButton toggleButton_19 = new JToggleButton("A");
		toggleButton_19.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		panel_1.add(toggleButton_19);

		JToggleButton toggleButton_20 = new JToggleButton("A");
		toggleButton_20.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		panel_1.add(toggleButton_20);

		JToggleButton toggleButton_21 = new JToggleButton("A");
		toggleButton_21.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		panel_1.add(toggleButton_21);

		JToggleButton toggleButton_22 = new JToggleButton("A");
		toggleButton_22.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		panel_1.add(toggleButton_22);

		JToggleButton toggleButton_23 = new JToggleButton("A");
		toggleButton_23.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		panel_1.add(toggleButton_23);

		JToggleButton toggleButton_24 = new JToggleButton("A");
		toggleButton_24.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		panel_1.add(toggleButton_24);

		JToggleButton toggleButton_25 = new JToggleButton("A");
		toggleButton_25.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		panel_1.add(toggleButton_25);

		JToggleButton toggleButton_26 = new JToggleButton("A");
		toggleButton_26.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		panel_1.add(toggleButton_26);

		JToggleButton toggleButton_27 = new JToggleButton("A");
		toggleButton_27.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		panel_1.add(toggleButton_27);

		JToggleButton toggleButton_28 = new JToggleButton("A");
		toggleButton_28.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		panel_1.add(toggleButton_28);

		JToggleButton toggleButton_29 = new JToggleButton("A");
		toggleButton_29.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		panel_1.add(toggleButton_29);

		JToggleButton toggleButton_30 = new JToggleButton("A");
		toggleButton_30.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		panel_1.add(toggleButton_30);

		JToggleButton toggleButton_31 = new JToggleButton("A");
		toggleButton_31.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		panel_1.add(toggleButton_31);

		JToggleButton toggleButton_32 = new JToggleButton("A");
		toggleButton_32.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		panel_1.add(toggleButton_32);

		JToggleButton toggleButton_33 = new JToggleButton("A");
		toggleButton_33.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		panel_1.add(toggleButton_33);

		JToggleButton toggleButton_34 = new JToggleButton("A");
		toggleButton_34.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		panel_1.add(toggleButton_34);

		JToggleButton toggleButton_35 = new JToggleButton("A");
		toggleButton_35.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		panel_1.add(toggleButton_35);

		JLabel label_1 = new JLabel("POINTS:");
		label_1.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		label_1.setBounds(313, 292, 82, 26);
		panel.add(label_1);

		JButton button_1 = new JButton("UNDO");
		button_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		button_1.setBounds(313, 149, 111, 35);
		panel.add(button_1);

		JButton button_2 = new JButton("RESET");
		button_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		button_2.setBounds(313, 195, 111, 35);
		panel.add(button_2);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(313, 57, 111, 35);
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 3, 0, 0));

		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon(PuzzlePlayerPanel.class.getResource("/resources/STAR.png")));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_3);

		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon(PuzzlePlayerPanel.class.getResource("/resources/STAR.png")));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_4);

		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon(PuzzlePlayerPanel.class.getResource("/resources/STAR.png")));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_5);

		JButton btnRemoveWord = new JButton("REMOVE WORD");
		btnRemoveWord.setFont(new Font("Comic Sans MS", Font.PLAIN, 10));
		btnRemoveWord.setBounds(313, 103, 111, 35);
		panel.add(btnRemoveWord);

		JLabel label_2 = new JLabel("1337");
		label_2.setBounds(313, 315, 111, 35);
		panel.add(label_2);
		label_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 32));

		JLabel lblMovesLeft = new JLabel("MOVES LEFT:");
		lblMovesLeft.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblMovesLeft.setBounds(313, 241, 111, 26);
		panel.add(lblMovesLeft);

		JLabel label_6 = new JLabel("52");
		label_6.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		label_6.setBounds(313, 260, 82, 26);
		panel.add(label_6);
	}

	private void initializeControllers(){
		btnMainMenu.addMouseListener(new ToMainMenuController(this.a, this.m));
	}

}
