package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;

public class ThemePlayer extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThemePlayer frame = new ThemePlayer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ThemePlayer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setBounds(0, 0, 434, 361);
		contentPane.add(panel);
		
		JLabel label = new JLabel("LEVEL 1");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Comic Sans MS", Font.BOLD, 28));
		label.setBounds(10, 11, 114, 35);
		panel.add(label);
		
		JButton button = new JButton("RESET");
		button.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		button.setBounds(313, 315, 111, 35);
		panel.add(button);
		
		JButton button_1 = new JButton("UNDO");
		button_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		button_1.setBounds(313, 276, 111, 35);
		panel.add(button_1);
		
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
		
		JLabel label_1 = new JLabel("THEME:");
		label_1.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		label_1.setBounds(313, 57, 82, 26);
		panel.add(label_1);
		
		JButton button_2 = new JButton("MAIN MENU");
		button_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
		button_2.setBounds(231, 11, 193, 35);
		panel.add(button_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("SCREAM      NOISES");
		textArea.setRows(2);
		textArea.setLineWrap(true);
		textArea.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
		textArea.setBounds(313, 83, 111, 55);
		panel.add(textArea);
		
		JLabel label_2 = new JLabel("WORDS FOUND:");
		label_2.setBounds(313, 185, 111, 14);
		panel.add(label_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(313, 202, 111, 70);
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(3, 0, 0, 0));
		
		JLabel label_3 = new JLabel("AAAAAA");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_3);
		
		JLabel label_4 = new JLabel("AAAAAAAAA");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_4);
		
		JLabel label_5 = new JLabel("AAAAAAAAA");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(label_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(313, 149, 111, 35);
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 3, 0, 0));
		
		JLabel label_6 = new JLabel("");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(label_8);
	}

}
